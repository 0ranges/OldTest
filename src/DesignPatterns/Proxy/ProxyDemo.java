package DesignPatterns;

/**
 * Created by user on 2017/4/7.
 */
public class ProxyDemo {
    public static void main(String args[]){
        Sourcable source = new Proxy();
        source.method();
    }
}
interface Sourcable{
    public void method();
}
class Source implements Sourcable{
    public void method(){
        System.out.println("this is a source.");
    }
}
class Proxy implements Sourcable{
    private Sourcable source;
    public Proxy(){
        this.source = new Source();
    }
    public void method(){
        System.out.println("1");
        this.source.method();
        System.out.println("2");
    }
}