package JAVA.JavaClass01;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by user on 2017/3/29.
 */
public class ComparatorDemo {
    public static void main(String args[]){
        Person per[] = {new Person("Tom",10),
                new Person("Amy",16),
                new Person("Sam",12),
                new Person("Tony",20)};
        Arrays.sort(per,new PersonCompare());
        for(int i = 0;i<per.length;i++){
            System.out.println(per[i].toString());
        }
    }
}
class Person {
    private String name;
    private int age;
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

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
        return name + "\t" + age;
    }
    public boolean equals(Object object){
        if(this == object){
            return true;
        }
        if(!(object instanceof Person)){
            return false;
        }
        Person person = (Person)object;
        if(person.name.equals(this.name)&&this.age == person.age){
            return true;
        }
        else{
            return false;
        }
    }
}
class PersonCompare implements Comparator<Person>{
    public int compare(Person per1,Person per2){
        if(per1.equals(per2)) {
            return 0;
        }else if(per1.getAge()>per2.getAge()){
            return 1;
        }else{
            return -1;
        }
    }
}