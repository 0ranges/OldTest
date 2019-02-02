package DPshiyan.DP3;

import java.util.ArrayList;

/**
 * Created by user on 2018/1/14.
 */
public class Q09 {
    public static void main(String[] args) {
        ResponseEquipment annunciatorObserver,cautionLightObserver,insulateDoorObserver,securityDoorObserver;
        annunciatorObserver = new AnnunciatorObserver();
        cautionLightObserver = new CautionLightObserver();
        insulateDoorObserver = new InsulatedDoorObserver();
        securityDoorObserver = new SecurityDoorObserver();
        ThermoSensor thermoSensor = new ThermoSensor();
        thermoSensor.register(annunciatorObserver);
        thermoSensor.register(cautionLightObserver);
        thermoSensor.register(insulateDoorObserver);
        thermoSensor.register(securityDoorObserver);
        thermoSensor.setTemperauture(45.0);
    }
}
interface ResponseEquipment{
    public void response();
}
class Annunciator{
    public void alarm(){
        System.out.println("报警器发出警报！");
    }
}
class AnnunciatorObserver implements ResponseEquipment{
    Annunciator annunciator = new Annunciator();
    public void response(){
        annunciator.alarm();
    }
}
class CautionLight {
    public void flicker(){
        System.out.println("警示灯闪烁！");
    }
}
class CautionLightObserver implements ResponseEquipment {
    private CautionLight cautionLight = new CautionLight();
    public void response() {
        cautionLight.flicker();
    }
}
class InsulatedDoor {
    public void close(){
        System.out.println("隔热门自动关闭！");
    }
}
class InsulatedDoorObserver implements ResponseEquipment {
    private InsulatedDoor insulatedDoor = new InsulatedDoor();
    public void response() {
        insulatedDoor.close();
    }
}
class SecurityDoor {
    public void open(){
        System.out.println("安全门自动开启！");
    }
}
class SecurityDoorObserver implements ResponseEquipment{
    private SecurityDoor securityDoor = new SecurityDoor();
    public void response(){
        securityDoor.open();
    }
}
class ThermoSensor {
    private ArrayList<ResponseEquipment> responseEquipments = new ArrayList<ResponseEquipment>();
    private double temperauture;
    public void register(ResponseEquipment responseEquipment) {
        responseEquipments.add(responseEquipment);
    }
    public void trigger(){
        for(ResponseEquipment responseEquipment:responseEquipments){
            responseEquipment.response();
        }
    }
    public double getTemperauture(){
        return temperauture;
    }
    public void setTemperauture(double temperauture){
        this.temperauture = temperauture;
        if(temperauture >= 40){
            System.out.println("温度超过正常温度");
            System.out.println("开始传递信号！");
            this.trigger();
            System.out.println("传递完成~");
        }else{
            System.out.println("温度适宜~~");
        }
    }
}