package JAVA.IOTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * Created by user on 2017/4/15.
 */
public class ZipOutputStreamDemo02 {
    public static void main(String[] args) throws Exception{
        File file = new File("D:\\text");
        File zipfile = new File("D:\\text.zip");
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(zipfile));
        InputStream is = null;
        zos.setComment("this is a test");
        if(file.isDirectory()){
            File list[] = file.listFiles();
            for(int i = 0;i<list.length;i++){
                is = new FileInputStream(list[i]);
                zos.putNextEntry(new ZipEntry(list[i].getName()));
                int temp = 0;
                while((temp = is.read()) != -1) {
                    zos.write(temp);
                }
                is.close();
            }
        }
        zos.close();
    }
}
