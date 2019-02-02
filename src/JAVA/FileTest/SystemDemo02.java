package JAVA.FileTest;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * Created by user on 2017/4/12.
 */
public class SystemDemo02 {
    public static void main(String args[]){
        String str = "hello";
        try{
            int a = Integer.parseInt(str);
        }catch (Exception e){
            try{
                System.setOut(new PrintStream(new FileOutputStream("D:\\text.txt")));
            }catch (FileNotFoundException e1){
                e1.printStackTrace();
            }
            System.out.print(e);
        }
    }
}
