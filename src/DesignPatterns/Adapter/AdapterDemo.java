package DesignPatterns.Adapter;

import java.io.Serializable;

/**
 * Created by user on 2017/4/7.
 */
public class AdapterDemo {
    public static void main(String args[]){
        Targetable targetable = new Adapter();
        targetable.method1();
        targetable.method2();
    }
}
class Source{
    public void method1(){
        System.out.println("this is source.");
    }
}
interface Targetable{
    public void method1();
    public void method2();
}
class Adapter extends Source implements Targetable{
    public void method2(){
        System.out.println("this is adapter.");
    }
}