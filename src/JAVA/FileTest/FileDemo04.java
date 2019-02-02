package JAVA.FileTest;

import java.io.File;

/**
 * Created by user on 2017/3/31.
 */
public class FileDemo04 {
    public static void main(String args[]){
        File file = new File("D:\\");
        if(file.isDirectory()){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
