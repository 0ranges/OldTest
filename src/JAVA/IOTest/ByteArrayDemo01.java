package JAVA.IOTest;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

/**
 * Created by user on 2017/4/3.
 */
public class ByteArrayDemo01 {
    public static void main(String args[]){
        String str = "HELLO WORLD";
        ByteArrayInputStream input = new ByteArrayInputStream(str.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int temp = 0;
        while((temp = input.read()) != -1){
            char c = (char)temp;
            out.write(Character.toLowerCase(c));
        }
        String toString = out.toString();
        try{
            //out.close();
            //input.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.print(toString);
    }
}
