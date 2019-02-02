package JAVA.IOTest;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/**
 * Created by user on 2017/4/15.
 */
public class ZipFileDemo01 {
    public static void main(String[] args) throws Exception{
        File file = new File("D:\\text.zip");
        File outputFile = new File("D:\\ab.txt");
        ZipFile zipFile = new ZipFile(file);
        ZipEntry zipEntry = zipFile.getEntry("ab.txt");
        InputStream is = zipFile.getInputStream(zipEntry);
        OutputStream os = new FileOutputStream(outputFile);
        int temp = 0;
        while((temp = is.read()) != -1){
            os.write(temp);
        }
        os.close();
        is.close();
    }
}
