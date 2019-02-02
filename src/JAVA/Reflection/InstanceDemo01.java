package JAVA.Reflection;

import java.lang.reflect.Constructor;

/**
 * Created by user on 2017/4/17.
 */
public class InstanceDemo01 {
    public static void main(String[] args) throws Exception{
        Class c = Class.forName("JAVA.Reflection.Person01");
        Constructor cons[] = c.getConstructors();
        Person01 p = (Person01)cons[1].newInstance("Amy",30);
        System.out.println(p);
    }
}
class Person01 extends Person{
    public Person01(){
        super();
    }
    public Person01(String name,int age){
        this.setAge(age);
        this.setName(name);
    }
}
