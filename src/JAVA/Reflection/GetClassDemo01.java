package JAVA.Reflection;

/**
 * Created by user on 2017/4/17.
 */
public class GetClassDemo01 {
    public static void main(String[] args) {
        X x = new X();
        System.out.println(x.getClass().getName());
    }
}
class X{

}