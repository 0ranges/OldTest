package JAVA.Collection;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by user on 2017/4/22.
 */
public class TreeSetDemo01 {
    public static void main(String[] args) {
        Set<Person>  treeSet = new HashSet<>();
        treeSet.add(new Person("Amy",20));
        treeSet.add(new Person("Sam",10));
        treeSet.add(new Person("Tom",14));
        treeSet.add(new Person("Daming",14));
        treeSet.add(new Person("Tony",2));
        treeSet.add(new Person("Bruce",22));
        treeSet.add(new Person("Dog",20));
        treeSet.add(new Person("Cat",1));
        treeSet.add(new Person("Hello",2));
        treeSet.add(new Person("Apple",10));
        System.out.println(treeSet);
        treeSet.clear();
        treeSet.add(new Person("Amy",20));
        treeSet.add(new Person("Amy",20));
        treeSet.add(new Person("Amy",20));
        System.out.println(treeSet);
    }
}
//class Person implements Comparable<Person>{
class Person{
    private String name;
    private int age;
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return "name:"+name+",age:"+age;
    }
//    public int compareTo(Person person){
//        if(this.age>person.age){
//            return 1;
//        }else if(this.age<person.age){
//            return -1;
//        }else {
//            return 0;
//        }
//    }
    public boolean equals(Object object){
        if(this == object){
            return true;
        }
        if(!(object instanceof Person)){
            return false;
        }
        Person person = (Person)object;
        if(this.name.equals(person.name)&&this.age==person.age){
            return true;
        }else {
            return false;
        }
    }
    public int hashCode(){
        return this.name.hashCode()*this.age;
    }
}