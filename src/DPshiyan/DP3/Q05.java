package DPshiyan.DP3;

/**
 * Created by user on 2018/1/13.
 */
public class Q05 {
    public static void main(String[] args) {
        Officer banzhang = new Banzhang("A班长");
        Officer paizhang = new Paizhang("B排长");
        Officer lianzhang = new Lianzhang("C连长");
        banzhang.setOfficer(paizhang);
        paizhang.setOfficer(lianzhang);
        Mission m1 = new Mission("mission1", 3);
        banzhang.handleMission(m1);
        Mission m2 = new Mission("mission2", 38);
        banzhang.handleMission(m2);
        Mission m3 = new Mission("mission3", 100);
        banzhang.handleMission(m3);
        Mission m4 = new Mission("mission4", 400);
        banzhang.handleMission(m4);
    }
}
class Mission{
    private String name;
    private int number;
    public Mission(String name,int number){
        this.name = name;
        this.number = number;
    }
    public int getNumber(){
        return number;
    }
    public String getName(){
        return name;
    }
}
abstract class Officer{
    public String name;
    public Officer successor;
    public Officer(String name){
        this.name = name;
    }
    public void setOfficer(Officer successor){
        this.successor = successor;
    }
    public abstract void handleMission(Mission mission);
}
class Banzhang extends Officer{
    public Banzhang(String name) {
        super(name);
    }
    @Override
    public void handleMission(Mission mission) {
        if(mission.getNumber()>0 && mission.getNumber()<10){
            System.out.println(name+"接到"+mission.getName()+"的军情"+",敌人数量为"+mission.getNumber()+",可以下达作战指令");
        }else{
            if(this.successor!=null)
            {
                this.successor.handleMission(mission);
            }
        }
    }
}
class Paizhang extends Officer{
    public Paizhang(String name) {
        super(name);
    }
    @Override
    public void handleMission(Mission mission) {
        if(mission.getNumber() >= 10 && mission.getNumber() < 50){
            System.out.println(name+"接到"+mission.getName()+"的军情"+",敌人数量为"+mission.getNumber()+",可以下达作战指令");
        }else{
            if(this.successor!=null)
            {
                this.successor.handleMission(mission);
            }
        }
    }
}
class Lianzhang extends Officer{
    public Lianzhang(String name) {
        super(name);
    }
    @Override
    public void handleMission(Mission mission) {
        if(mission.getNumber() >= 50 && mission.getNumber() < 200){
            System.out.println(name+"接到"+mission.getName()+"的军情"+",敌人数量为"+mission.getNumber()+",可以下达作战指令");
        }else{
            System.out.println("接到" + mission.getName() + "的军情" + ",敌人数量为" + mission.getNumber() + ",敌人太多了，开会讨论！");
        }
    }
}