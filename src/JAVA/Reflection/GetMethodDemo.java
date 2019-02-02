package JAVA.Reflection;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Created by user on 2017/4/17.
 */
public class GetMethodDemo {
    public static void main(String[] args) throws Exception{
        Class c = Class.forName("JAVA.Reflection.Student");
        Method m[] = c.getMethods();
        for(int i = 0 ;i<m.length;i++){
            Class r = m[i].getReturnType();
            Class p[] = m[i].getParameterTypes();
            System.out.print(Modifier.toString(m[i].getModifiers())+" ");
            System.out.print(r.getName()+" ");
            System.out.print(m[i].getName()+" ");
            System.out.print("(");
            for(int x = 0;x<p.length;x++){
                System.out.print(p[x].getName()+" arg"+i);
                if(x<p.length-1){
                    System.out.print(",");
                }
            }
            Class ex[] = m[i].getExceptionTypes();
            if(ex.length>0){
                System.out.print(") throws ");
                for(int j = 0;j<ex.length;j++){
                    System.out.print(ex[j].getName());
                    if(j<ex.length-1){
                        System.out.print(",");
                    }
                }
            }else {
                System.out.print(")");
            }
            System.out.println();
        }
    }
}
