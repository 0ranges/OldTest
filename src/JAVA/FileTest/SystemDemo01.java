package JAVA.FileTest;

import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * Created by user on 2017/4/12.
 */
public class SystemDemo01 {
    public static void main(String args[]) throws Exception{
        System.setOut(new PrintStream(new FileOutputStream("D:\\text.txt")));
        System.out.println("hello");
        System.out.print("world!");
    }
}
