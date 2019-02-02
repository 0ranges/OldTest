package JAVA.IOTest;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * Created by user on 2017/4/2.
 */
public class OutStreamDemo01 {
    public static void main(String args[]) throws Exception{
        File file = new File("D:\\text.txt");
        //OutputStream out = new FileOutputStream(file);
        OutputStream out = new FileOutputStream(file,true);
        byte b[] = new String("\r\n你好").getBytes();
        out.write(b);
        //out.close();
    }
}
