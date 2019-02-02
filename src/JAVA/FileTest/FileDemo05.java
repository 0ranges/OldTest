package JAVA.FileTest;

import java.io.File;

/**
 * Created by user on 2017/3/31.
 */
public class FileDemo05 {
    public static void main(String args[]){
        String path = "e:\\学习";
        Runtime runtime = Runtime.getRuntime();
        System.out.println(path);
        print(path,runtime);
    }
    public static void print(String path,Runtime runtime){
        File file = new File(path);
        File filelist[] = file.listFiles();

        for(int i = 0;i<filelist.length;i++){
            if(filelist[i].isDirectory()) {
                a++;
                System.out.println(filelist[i]+ "\t"+runtime.freeMemory()+"\t"+a);
                print(filelist[i].toString(),runtime);
            }else{
                a++;
                System.out.println(filelist[i] +"\t"+runtime.freeMemory()+"\t"+a);
            }
        }
    }
    public static int a = 0;
}
