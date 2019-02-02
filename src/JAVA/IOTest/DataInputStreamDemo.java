package JAVA.IOTest;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

/**
 * Created by user on 2017/4/15.
 */
public class DataInputStreamDemo {
    public static void main(String[] args) throws Exception{
        DataInputStream dis = new DataInputStream(new FileInputStream(new File("D:\\text.txt")));
        String name = null;
        float price = 0.0f;
        int num = 0;
        char temp[] = null;
        char c = 0;
        int len = 0;
        try{
            while(true){
                temp = new char[200];
                len = 0;
                while((c = dis.readChar())!='\t'){
                    temp[len] = c;
                    len++;
                }
                name = new String(temp,0,len);
                price = dis.readFloat();
                dis.readChar();
                num = dis.readInt();
                dis.readChar();
                System.out.printf("名称：%s，价格：%2.1f，数量：%d\n",name,price,num);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        dis.close();
    }
}
