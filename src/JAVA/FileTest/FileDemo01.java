package JAVA.FileTest;

import java.io.File;

/**
 * Created by user on 2017/3/31.
 */
public class FileDemo01 {
    public static void main(String args[]){
        String path = "D:"+File.separator+"text.txt";
        File file = new File(path);
        if(file.exists()){
            file.delete();
        }else {
            try {
                file.createNewFile();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
