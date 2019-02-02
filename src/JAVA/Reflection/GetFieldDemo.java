package JAVA.Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * Created by user on 2017/4/18.
 */
public class GetFieldDemo {
    public static void main(String[] args) throws Exception {
        Class c = Class.forName("JAVA.Reflection.Student");
        Field field[] = c.getDeclaredFields();
        for(int i = 0;i<field.length;i++){
            Class r = field[i].getType();
            System.out.print("本地属性：");
            System.out.print(Modifier.toString(field[i].getModifiers())+" ");
            System.out.print(r.getName()+" ");
            System.out.print(field[i].getName());
            System.out.println(";");
        }
        System.out.println("--------------------------------------");
        Field f[] = c.getFields();
        for(int i = 0;i<f.length;i++){
            Class r = f[i].getType();
            System.out.print("公共属性：");
            System.out.print(Modifier.toString(f[i].getModifiers())+" ");
            System.out.print(r.getName()+" ");
            System.out.print(f[i].getName());
            System.out.println(";");
        }
    }
}
