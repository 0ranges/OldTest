package JAVA.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

/**
 * Created by user on 2017/4/17.
 */
public class GetInterfaceDemo {
    public static void main(String[] args) throws Exception{
        Class c = Class.forName("JAVA.Reflection.Student");
        Class interfaces[] = c.getInterfaces();
        for(int i = 0;i<interfaces.length;i++){
            System.out.println(interfaces[i].getName());
        }
        System.out.println(c.getSuperclass().getName());
        Constructor cons[] = c.getConstructors();
        for(int i = 0;i<cons.length;i++){
            Class p[] = cons[i].getParameterTypes();
            System.out.print("构造方法：");
            System.out.print(Modifier.toString(cons[i].getModifiers())+" ");
            System.out.print(cons[i].getName());
            System.out.print("(");
            for(int j = 0;j<p.length;j++){
                System.out.print(p[j].getName()+" arg"+i);
                if(j<p.length-1){
                    System.out.print(",");
                }
            }
            System.out.println("){}");
        }
    }
}
interface China{
    public static final String NATIONAL = "CHINA";
    public static final String NAME = "Sam";
    public void sayChina();
    public String sayHello(String name,int age);
}
class Student implements China{
    private int age;
    private String name;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void sayChina(){
        System.out.println("姓名："+NAME+"，国籍："+NATIONAL);
    }
    public String sayHello(String name,int age){
        return name+"，你好！我今年"+age+"岁了！";
    }
}
