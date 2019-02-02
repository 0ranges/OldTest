package JAVA.IOTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Created by user on 2017/4/2.
 */
public class InputStreamDemo02 {
    public static void main(String args[]) throws Exception{
        File file = new File("D:\\text.txt");
        InputStream input = new FileInputStream(file);
        int len = 0;
        byte b[] = new byte[1024];
        int temp = 0;
        while((temp = input.read())!=-1){
            b[len] = (byte)temp;
            len++;
        }
        input.close();
        System.out.println(new String(b));
    }
}
