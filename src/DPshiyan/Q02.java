package DPshiyan;

/**
 * Created by user on 2017/12/12.
 */
public class Q02 {
    public static void main(String[] args) {
       Role role;
       String type = (String)XMLUtil.getBean("RoleFactory");
       role = RoleFactory.createRole(type);
       role.display();
    }
}
class RoleFactory{
    public static Role createRole(String type){
        if(type == "hero")
            return new Hero();
        else if(type == "Angel")
            return new Angel();
        else if(type == "Witch")
            return new Witch();
        else
            return null;
    }
}
interface Role{
    public void display();
}
class Hero implements Role{
    public void display(){
        System.out.println("hero");
    }
}
class Angel implements Role{
    public void display(){
        System.out.println("angel");
    }
}
class Witch implements Role{
    public void display(){
        System.out.println("witch");
    }
}