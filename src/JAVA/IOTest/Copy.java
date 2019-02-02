package JAVA.IOTest;

import java.io.*;

/**
 * Created by user on 2017/4/2.
 */
public class Copy {
    public static void main(String args[]) throws Exception{
        File file1 = new File("D:\\text.txt");
        File file2 = new File("D:\\Demo.txt");
        InputStream input = new FileInputStream(file1);
        OutputStream out = new FileOutputStream(file2);
        byte b[] = new byte[(int)file1.length()];
        input.read(b);
        out.write(b);
        input.close();
        out.close();
        System.out.println();
    }
}
