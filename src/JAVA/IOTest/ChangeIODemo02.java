package JAVA.IOTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * Created by user on 2017/4/2.
 */
public class ChangeIODemo02 {
    public static void main(String args[]) throws Exception{
        File file = new File("D:\\Demo.txt");
        Reader input = new InputStreamReader(new FileInputStream(file));
        char b[] = new char[(int)file.length()];
        input.read(b);
        System.out.println(new String(b));
        input.close();
    }
}
