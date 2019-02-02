package JAVA.IOTest;

import java.io.*;

/**
 * Created by user on 2017/4/16.
 */
public class SerDemo01 {
    public static void main(String[] args) throws Exception {
        File file = new File("D:\\text.txt");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        oos.writeObject(new Person("张三",20));
        oos.close();
    }
}
class Person implements Externalizable{
    private String name;
    private int age;
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "姓名："+this.name+"，年龄："+this.age+"。";
    }
    public void readExternal(ObjectInput in) throws IOException,ClassNotFoundException{
        this.name = (String)in.readObject();
        this.age = in.readInt();
    }
    public void writeExternal(ObjectOutput out) throws IOException{
        out.writeObject(this.name);
        out.writeInt(age);
    }
}
