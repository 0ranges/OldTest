package JAVA.Reflection;

import java.lang.reflect.Array;

/**
 * Created by user on 2017/4/18.
 */
public class ChangeArrayDemo {
    public static void main(String[] args) throws Exception {
        int temp[] = {1,2,3};
        int newTemp[] = (int[])arrayInc(temp,5);
        print(newTemp);
        System.out.println("--------------------");
        String str[] = {"abc","aeg","zxc"};
        String newStr[] = (String[])arrayInc(str,6);
        print(newStr);
    }
    public static Object arrayInc(Object object,int len){
        Class c = object.getClass();
        Class arr = c.getComponentType();
        Object newO = Array.newInstance(arr,len);
        int co = Array.getLength(object);
        System.arraycopy(object,0,newO,0,co);
        return newO;
    }
    public static void print(Object object){
        Class c = object.getClass();
        if(!c.isArray()){
            return;
        }
        Class arr = c.getComponentType();
        System.out.println(arr.getName()+"数组的长度为："+Array.getLength(object));
        for(int i = 0 ;i<Array.getLength(object);i++){
            System.out.print(Array.get(object,i)+"、");
        }
    }
}
