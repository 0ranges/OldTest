package JAVA.JavaClass01;

import java.util.Arrays;

/**
 * Created by user on 2017/3/29.
 */
public class CompareDemo01 {
    public static void main(String args[]){
        Student01 stu[] = {new Student01("Amy",20,90.0f),
                           new Student01("Sam",22,90.0f),
                           new Student01("Tom",20,100.0f),
                           new Student01("Daling",18,99.0f),
                           new Student01("Kael",16,99.0f)};
        Arrays.sort(stu);
        for(int i = 0;i<stu.length;i++){
            System.out.println(stu[i].toString());
        }
    }
}
class Student01 implements Comparable<Student01>{
    private String name;
    private int age;
    private float score;
    public Student01(String name,int age,float score){
        this.name = name;
        this.age = age;
        this.score = score;
    }
    public String toString(){
        return this.name+"\t"+this.age+"\t"+this.score;
    }
    public int compareTo(Student01 student01){
        if(this.score>student01.score){
            return -1;
        }else if(this.score<student01.score){
            return 1;
        }
        else{
            if(this.age>student01.age){
                return -1;
            }else if(this.age<student01.age){
                return 1;
            }
            else {
                return 0;
        }
        }
    }
}
