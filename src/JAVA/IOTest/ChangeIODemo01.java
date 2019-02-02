package JAVA.IOTest;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

/**
 * Created by user on 2017/4/2.
 */
public class ChangeIODemo01 {
    public static void main(String args[]) throws Exception{
        File file = new File("D:\\text.txt");
        Writer out = new OutputStreamWriter(new FileOutputStream(file));
        out.write("abc");
        //out.flush();
    }
}
