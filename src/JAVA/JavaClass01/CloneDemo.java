package JAVA.JavaClass01;

/**
 * Created by user on 2017/3/29.
 */
public class CloneDemo {
    public static void main(String args[]) throws Exception{
        Student student1 = new Student("Sam");
        Student student2 = (Student) student1.clone();
        student2.setName("Amy");
        System.out.println(student1.toString());
        System.out.println(student2.toString());
    }
}
class Student implements Cloneable{         //必须实现这个接口
    private String name = null;

    public Student(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String toString(){
        return "姓名："+this.name;
    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}