package DesignPatterns.Bridge;

/**
 * Created by user on 2017/4/8.
 */
public class BridgeDemo {
    public static void main(String args[]){
        Bridge bridge = new MyBridge();
        Sourcable source1 = new SourceSub1();
        bridge.setSource(source1);
        bridge.method();
        Sourcable source2 = new SourceSub2();
        bridge.setSource(source2);
        bridge.method();
    }
}

interface Sourcable{
    public void method();
}
class SourceSub1 implements Sourcable{
    public void method(){
        System.out.println("This is source1.");
    }
}
class SourceSub2 implements Sourcable{
    public void method(){
        System.out.println("This is source2.");
    }
}
abstract class Bridge {
    private Sourcable source;
    public void method(){
        source.method();
    }

    public Sourcable getSource() {
        return source;
    }

    public void setSource(Sourcable source) {
        this.source = source;
    }
}
class MyBridge extends Bridge{
    public void method(){
        getSource().method();
    }
}