package JAVA.IOTest;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * Created by user on 2017/4/15.
 */
public class ZipOutputStreamDemo01 {
    public static void main(String[] args) throws Exception{
        File file = new File("D:\\ab.txt");
        File zipfile = new File("D:\\ab.zip");
        InputStream is = new FileInputStream(file);
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(zipfile));
        zos.putNextEntry(new ZipEntry(file.getName()));
        int temp = 0;
        while((temp = is.read())!=-1){
            zos.write(temp);
        }
        is.close();
        zos.close();
    }
}
