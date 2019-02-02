package DPshiyan.DP3;

/**
 * Created by user on 2018/1/13.
 */
public class Q06 {
    public static void main(String[] args) {
        Switch sw = new Switch();
        AbstractCommand command = (AbstractCommand)XMLUtil.getBean("abstractCommand");
        sw.setCommand(command);
        sw.open();
        sw.close();
    }
}
abstract class AbstractCommand{
    public abstract void open();
    public abstract void close();
}
class Fun{
    public void open(){
        System.out.println("开风扇");
    }
    public void close(){
        System.out.println("关风扇");
    }
}
class FunCommand extends AbstractCommand{
    private Fun fun = new Fun();
    public void open(){
        fun.open();
    }
    public void close(){
        fun.close();
    }
}
class Light{
    public void open(){
        System.out.println("开灯");
    }
    public void close(){
        System.out.println("关灯");
    }
}
class LightCommand extends AbstractCommand{
    private Light light = new Light();
    public void open(){
        light.open();
    }
    public void close(){
        light.close();
    }
}
class Switch{
    private AbstractCommand command;
    public void setCommand(AbstractCommand command){
        this.command = command;
    }
    public void open(){
        command.open();
    }
    public void close(){
        command.close();
    }
}