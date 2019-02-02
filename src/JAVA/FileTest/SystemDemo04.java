package JAVA.FileTest;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Created by user on 2017/4/12.
 */
public class SystemDemo04 {
    public static void main(String args[]) throws Exception{
        System.setIn(new FileInputStream("D:\\text.txt"));
        InputStream input = System.in;
        byte b[] = new byte[1024];
        int len = input.read(b);
        System.out.print(new String(b,0,len));
        input.close();
    }
}
