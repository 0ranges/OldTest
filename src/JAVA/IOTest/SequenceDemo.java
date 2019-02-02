package JAVA.IOTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

/**
 * Created by user on 2017/4/15.
 */
public class SequenceDemo {
    public static void main(String[] args) throws Exception{
        SequenceInputStream sis = new SequenceInputStream(new FileInputStream("D:\\Demo.txt"),new FileInputStream("D:\\text.txt"));
        FileOutputStream fos = new FileOutputStream("D:\\ab.txt");
        int temp = 0;
        while((temp = sis.read()) != -1){
            fos.write(temp);
        }
        sis.close();
        fos.close();
    }
}
