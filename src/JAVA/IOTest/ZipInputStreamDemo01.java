package JAVA.IOTest;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

/**
 * Created by user on 2017/4/15.
 */
public class ZipInputStreamDemo01 {
    public static void main(String[] args) throws Exception{
        File file = new File("D:\\text.zip");
        ZipFile zipFile = new ZipFile(file);
        ZipInputStream zis = new ZipInputStream(new FileInputStream(file));
        File outFile = null;
        ZipEntry zipEntry = null;
        InputStream input = null;
        OutputStream out = null;
        while((zipEntry = zis.getNextEntry())!=null){
            System.out.println("解压"+zipEntry.getName()+"文件");
            outFile = new File("D:\\"+zipEntry.getName());
            if(!outFile.getParentFile().exists()){
                outFile.getParentFile().mkdir();
            }
            if(!outFile.exists()){
                outFile.createNewFile();
            }
            input = zipFile.getInputStream(zipEntry);
            out = new FileOutputStream(outFile);
            int temp = 0;
            while((temp = input.read())!=-1){
                out.write(temp);
            }
            input.close();
            out.close();
        }
        zis.close();
    }
}
