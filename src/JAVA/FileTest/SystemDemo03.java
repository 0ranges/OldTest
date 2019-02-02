package JAVA.FileTest;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Created by user on 2017/4/12.
 */
public class SystemDemo03  {
    public static void main (String args[]) throws Exception{
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setErr(new PrintStream(bos));
        System.err.println("hello");
        System.err.print("world");
        System.out.print(bos);
    }
}
