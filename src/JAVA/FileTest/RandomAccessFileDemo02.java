package JAVA.FileTest;

import java.io.File;
import java.io.RandomAccessFile;

/**
 * Created by user on 2017/3/31.
 */
public class RandomAccessFileDemo02 {
    public static void main(String args[]) throws Exception{
        File file = new File("D:\\text.txt");
        RandomAccessFile raf = new RandomAccessFile(file,"r");
        String name = null;
        byte get[] = new byte[8];
        raf.skipBytes(0);
        for(int i = 0;i<8;i++){
            get[i] = raf.readByte();
        }
        name = new String(get);
        System.out.print(name);
    }
}
