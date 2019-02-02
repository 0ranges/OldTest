package JAVA.IOTest;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * Created by user on 2017/4/3.
 */
public class PrintDemo {
    public static void main(String args[]) throws Exception{
        PrintStream ps = new PrintStream(new FileOutputStream(new File("D:\\text.txt")));
        ps.print("hello");
        ps.println("hello world");
        ps.print("1+1=2");
        ps.close();
    }
}
