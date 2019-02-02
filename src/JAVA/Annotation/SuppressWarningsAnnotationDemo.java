package JAVA.Annotation;

/**
 * Created by user on 2017/4/19.
 */
public class SuppressWarningsAnnotationDemo {
    @SuppressWarnings(value = {"unchecked","deprecation"})
    public static void main(String[] args) {
        Demo d = new Demo();
        d.setName("abc");
        System.out.println(d.getName());
    }
}
@Deprecated
class Demo<T>{
    T name;

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }
}
