package JAVA.IOTest;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

/**
 * Created by user on 2017/4/15.
 */
public class DataOutpubStreamDemo{
    public static void main(String[] args) throws Exception{
        File file = new File("D:\\text.txt");
        DataOutputStream dos = new DataOutputStream(new FileOutputStream(file));
        String name[] = {"衣服","手套","围巾"};
        float prices[] = {98.3f,30.3f,50.5f};
        int nums[] = {3,1,2};
        for (int i = 0;i < name.length;i++){
            dos.writeChars(name[i]);
            dos.writeChar('\t');
            dos.writeFloat(prices[i]);
            dos.writeChar('\t');
            dos.writeInt(nums[i]);
            dos.writeChar('\n');
        }
        dos.close();
    }
}
