package JAVA.Reflection;

/**
 * Created by user on 2017/4/18.
 */
public class ClassLoaderDemo {
    public static void main(String[] args) {
        People p = new People();
        System.out.println("类加载器："+p.getClass().getClassLoader().getClass().getName());
    }
}
class People{

}