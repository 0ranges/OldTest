package JAVA.IOTest;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

/**
 * Created by user on 2017/4/2.
 */
public class WriterDemo01 {
    public static void main(String args[]) throws Exception{
        File file = new File("D:\\text.txt");
        Writer writer = new FileWriter(file);
        writer.write("123");
        //writer.close();
        writer.flush();
    }
}
