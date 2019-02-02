package JAVA.Reflection;

/**
 * Created by user on 2017/4/17.
 */
public class GetClassDemo02 {
    public static void main(String[] args) {
        Class<?> c1 = null;
        Class<?> c2 = null;
        Class<?> c3 = null;
        try{
            c1 = Class.forName("JAVA.Reflection.Y");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        c2 = new Y().getClass();
        c3 = Y.class;
        System.out.println(c1.getName());
        System.out.println(c2.getName());
        System.out.println(c3.getName());
    }
}
class Y{

}
