package JAVA.JavaClass;

/**
 * Created by user on 2017/3/28.
 */
public class SystemTest02 {
    public static void main(String args[]){
        Person per = new Person();
        per = null;
        System.gc();
    }
}
class Person{
    @Override
    public void finalize() throws Throwable{
        System.out.print("对象被释放");
    }
}