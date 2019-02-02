package JAVA.Reflection;

import java.lang.reflect.Method;

/**
 * Created by user on 2017/4/18.
 */
public class InvokeGetSetDemo {
    public static void main(String[] args) {
        Class c = null;
        try{
            c = Class.forName("JAVA.Reflection.Student");
        }catch (Exception e){
            e.printStackTrace();
        }
        Object object = null;
        try{
            object = c.newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        setter(object,"name","Same",String.class);
        setter(object,"age",22,int.class);
        System.out.println("姓名：");
        getter(object,"name");
        System.out.println("年龄：");
        getter(object,"age");
    }
    public static void setter(Object object,String str,Object value,Class type){
        try{
            Method med = object.getClass().getMethod("set"+initStr(str),type);
            med.invoke(object,value);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void getter(Object object,String str){
        try{
            Method method = object.getClass().getMethod("get"+initStr(str));
            System.out.println(method.invoke(object));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static String initStr(String old){
        String  str = old.substring(0,1).toUpperCase()+old.substring(1);
        return str;
    }
}
