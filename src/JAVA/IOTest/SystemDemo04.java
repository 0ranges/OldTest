package JAVA.IOTest;

import java.io.InputStream;

/**
 * Created by user on 2017/4/3.
 */
public class SystemDemo04 {
    public static void main(String args[]) throws Exception{
        InputStream in = System.in;
        StringBuffer buf = new StringBuffer();
        System.out.print("请输入：");
        int temp = 0;
        while((temp = in.read())!=-1){
            char c = (char)temp;
            if(c == '\n'){
                break;
            }
            buf.append(c);
        }
        System.out.print(buf);
        in.close();
    }
}
