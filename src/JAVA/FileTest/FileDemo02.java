package JAVA.FileTest;

import java.io.File;

/**
 * Created by user on 2017/3/31.
 */
public class FileDemo02 {
    public static void main(String args[]){
        File file = new File("D:\\abc");
        file.mkdir();             //根据上述路径创建一个文件夹
    }
}
