package JAVA.IOTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by user on 2017/4/12.
 */
public class BufferedReaderDemo {
    public static void main(String[] args) {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        System.out.print("请输入内容：");
        try{
            str = buf.readLine();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.print("输入的内容为："+str);
    }
}
