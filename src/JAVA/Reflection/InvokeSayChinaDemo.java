package JAVA.Reflection;

import java.lang.reflect.Method;

/**
 * Created by user on 2017/4/18.
 */
public class InvokeSayChinaDemo {
    public static void main(String[] args) {
        Class c = null;
        try{
            c = Class.forName("JAVA.Reflection.Student");
        }catch (Exception e){
            e.printStackTrace();
        }
        try{
            Method method = c.getMethod("sayChina");
            method.invoke(c.newInstance());
            method = c.getMethod("sayHello",String.class,int.class);
            String str = (String)method.invoke(c.newInstance(),"Tom",20);
            System.out.println(str);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
