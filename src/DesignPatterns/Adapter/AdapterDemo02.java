package DesignPatterns.Adapter;

/**
 * Created by user on 2017/4/7.
 */
public class AdapterDemo02 {
    public static void main(String args[]){
        Sourcable sourcable1 = new Source01();
        Sourcable sourcable2 = new Source02();
        sourcable1.method1();
        sourcable1.method2();
        sourcable2.method2();
        sourcable2.method1();
    }
}
interface Sourcable{
    public void method1();
    public void method2();
}
abstract class Wrapper01 implements Sourcable{
    public void method1(){
        System.out.println();
    }
    public void method2(){
        System.out.println();
    }
}
class Source01 extends Wrapper01{
    public void method1(){
        System.out.println("this is method1.");
    }
}
class Source02 extends Wrapper01{
    public void method2(){
        System.out.println("this is method2.");
    }
}