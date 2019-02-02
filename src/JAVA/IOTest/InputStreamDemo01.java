package JAVA.IOTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Created by user on 2017/4/2.
 */
public class InputStreamDemo01 {
    public static void main(String args[]) throws Exception{
        File file = new File("D:\\text.txt");
        InputStream input = new FileInputStream(file);
        byte b[] = new byte[(int)file.length()];
        System.out.println(file.length());
        int len = input.read(b);
        input.close();
        System.out.println(new String(b,0,len));
    }
}
