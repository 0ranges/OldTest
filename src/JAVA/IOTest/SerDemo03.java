package JAVA.IOTest;
import java.io.*;

/**
 * Created by user on 2017/4/16.
 */
public class SerDemo03 {
    public static void main(String[] args) throws Exception {
        ser();
        dser();
    }
    public static void ser() throws Exception{
        File file = new File("D:\\text.txt");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        oos.writeObject(new Person("zhangsan",20));
        oos.close();
    }
    public static void dser() throws Exception{
        File file = new File("D:\\text.txt");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        Object object = ois.readObject();
        ois.close();
        System.out.println(object);
    }
}
class Person01 implements Externalizable{
    private String name;
    private int age;
    public Person01(String name,int age){
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