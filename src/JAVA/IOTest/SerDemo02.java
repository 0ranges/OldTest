package JAVA.IOTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * Created by user on 2017/4/16.
 */
public class SerDemo02 {
    public static void main(String[] args) throws Exception{
        File file = new File("D:\\text.txt");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        Object object = ois.readObject();
        ois.close();
        System.out.println(object);
    }
}
