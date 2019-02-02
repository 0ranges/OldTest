package JAVA.FileTest;

import java.io.File;
import java.io.RandomAccessFile;

/**
 * Created by user on 2017/3/31.
 */
public class RandomAccessFileDemo01 {
    public static void main(String args[]) throws Exception{
        File file = new File("D:\\text.txt");
        if(!file.exists()){
            try {
                file.createNewFile();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        RandomAccessFile raf = new RandomAccessFile(file,"rw");
        String name = null;
        int age = 0;
        name = "zhangsan";
        age = 30;
        raf.writeBytes(name);
        raf.writeInt(age);
        name = "lisi    ";
        age = 22;
        raf.writeBytes(name);
        raf.writeInt(age);
        name = "wangwu  ";
        age = 20;
        raf.writeBytes(name);
        raf.writeInt(age);
        raf.close();
    }
}
