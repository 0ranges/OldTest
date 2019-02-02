package DesignPatterns.Adapter;

/**
 * Created by user on 2017/4/7.
 */
public class AdapterDemo01 {
    public static void main(String args[]){
        Targetable wrapper = new Wrapper(new Source());
        wrapper.method2();
        wrapper.method1();
    }
}
class Wrapper implements Targetable{
    private Source source;
    public Wrapper(Source source){
        super();
        this.source = source;
    }
    public void method1(){
        source.method1();
    }
    public void method2(){
        System.out.println("this is a wrapper.");
    }
}