package JAVA.Reflection;

/**
 * Created by user on 2017/4/17.
 */
public class GetClassDemo03 {
    public static void main(String[] args) throws Exception{
        Class c = Class.forName("JAVA.Reflection.Person");
        Person person = (Person)c.newInstance();
        person.setAge(20);
        person.setName("Amy");
        System.out.println(person);
    }
}
class Person{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "姓名："+name+"，年龄："+age;
    }
}
