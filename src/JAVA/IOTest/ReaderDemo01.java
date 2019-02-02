package JAVA.IOTest;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;

/**
 * Created by user on 2017/4/2.
 */
public class ReaderDemo01 {
    public static void main(String args[]) throws Exception{
        File file = new File("D:\\text.txt");
        Reader reader = new FileReader(file);
        int len = 0;
        int temp = 0;
        char c[] = new char[1024];
        while((temp = reader.read()) != -1){
            c[len] = (char)temp;
            len++;
        }
        reader.close();
        System.out.println(new String(c,0,len));
    }
}
