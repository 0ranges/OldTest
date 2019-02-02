package DesignPatterns.Decorator;

/**
 * Created by user on 2017/4/7.
 */
public class DecoratorDemo {
    public static void main(String args[]){
        Sourcable source = new Source();
        Decorator decorator = new Decorator(source);
        decorator.method();
    }
}
interface Sourcable{
    public void method();
}
class Source implements Sourcable{
    public void method(){
        System.out.println("This is source.");
    }
}
class Decorator implements Sourcable{
    private Sourcable source;
    public Decorator(Sourcable source){
        this.source = source;
    }
    public void method(){
        System.out.println("before decorator");
        source.method();
        System.out.println("after decorator");
    }
}
//class Decorator extends Source{
//    public void method(){
//        System.out.println("before decorator");
//        super.method();
//        System.out.println("after decorator");
//    }
//}