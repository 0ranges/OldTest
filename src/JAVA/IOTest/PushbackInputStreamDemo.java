package JAVA.IOTest;

import java.io.ByteArrayInputStream;
import java.io.PushbackInputStream;

/**
 * Created by user on 2017/4/16.
 */
public class PushbackInputStreamDemo {
    public static void main(String[] args) throws Exception{
        String str = "www.baidu.com";
        ByteArrayInputStream bai = new ByteArrayInputStream(str.getBytes());
        PushbackInputStream pis = new PushbackInputStream(bai);
        System.out.println("读取之后变为：");
        int temp = 0;
        while((temp = pis.read()) != -1){
            if(temp == '.'){
                pis.unread(temp);
                temp = pis.read();
                System.out.print("（退回"+(char)temp+"）");
            }else {
                System.out.print((char)temp);
            }
        }
    }
}
