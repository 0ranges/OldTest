package JAVA.IOTest;

import java.io.InputStream;

/**
 * Created by user on 2017/4/3.
 */
public class SystemDemo02 {
    public static void main(String args[]) throws Exception{
        InputStream in = System.in;
        byte b[] = new byte[1024];
        System.out.print("请输入：");
        int len = in.read(b);
        System.out.println(new String(b,0,len));
        in.close();
    }
}
