package JAVA.FileTest;

import java.io.File;

/**
 * Created by user on 2017/3/31.
 */
public class FileDemo03 {
    public static void main(String args[]){
        File file = new File("D:\\");
        String filelist[] = file.list();               //获取文件名称
        File listFiles[] = file.listFiles();           //获取文件路径
        for(int i = 0;i<filelist.length;i++){
            System.out.println(filelist[i]);
        }
        for(int i = 0;i<listFiles.length;i++){
            System.out.println(listFiles[i]);
        }
    }
}
