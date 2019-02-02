package JAVA.Annotation;

/**
 * Created by user on 2017/4/19.
 */
public class DeprecatedAnnotationDemo {
    public static void main(String[] args) {
        System.out.println(Person.getInfo()+",hello.");
    }
}
@Deprecated
class Person{
    @Deprecated
    public static String getInfo(){
        return "lalinsen";
    }
}