package JAVA.Reflection;

import java.lang.reflect.Field;

/**
 * Created by user on 2017/4/18.
 */
public class InvokeFieldDemo {
    public static void main(String[] args) throws Exception{
        Class c = Class.forName("JAVA.Reflection.Student");
        Student p = (Student)c.newInstance();
        Field name = c.getDeclaredField("name");
        Field age = c.getDeclaredField("age");
        name.setAccessible(true);
        age.setAccessible(true);
        name.set(p,"Sam");
        age.set(p,20);
        System.out.println("name:"+name.get(p));
        System.out.println("age:"+age.get(p));
    }
}
