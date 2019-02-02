package JAVA.Reflection;

import java.lang.reflect.Array;

/**
 * Created by user on 2017/4/18.
 */
public class ClassArrayDemo {
    public static void main(String[] args) throws Exception {
        int temp[] = {1,2,3};
        Class c = temp.getClass().getComponentType();
        System.out.println("类型："+c.getName());
        System.out.println("长度："+ Array.getLength(temp));
        System.out.println("第一个内容："+Array.get(temp,0));
        Array.set(temp,0,6);
        System.out.println("第一个内容："+Array.get(temp,0));
    }
}
