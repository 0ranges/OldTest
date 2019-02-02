package DesignPatterns.ChainofResponsibility;

/**
 * Created by user on 2017/4/12.
 */
public class ChainofResponsibilityDemo {
    public static void main(String args[]){
        MyHandle myHandle1 = new MyHandle("m1");
        MyHandle myHandle2 = new MyHandle("m2");
        MyHandle myHandle3 = new MyHandle("m3");
        myHandle1.setHandle(myHandle2);
        myHandle2.setHandle(myHandle3);
        myHandle1.operator();
    }
}
interface Handle{
    public void operator();
}
abstract class AbstractHandle{
    private Handle handle;

    public Handle getHandle() {
        return handle;
    }

    public void setHandle(Handle handle) {
        this.handle = handle;
    }
}
class MyHandle extends AbstractHandle implements Handle{
    private String name;
    public MyHandle(String name){
        this.name = name;
    }
    public void operator(){
        System.out.println(this.name+" deal!");
        if(getHandle() != null){
            getHandle().operator();
        }
    }
}