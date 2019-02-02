package JAVA.FileTest;

import java.io.File;

/**
 * Created by user on 2017/3/31.
 */
public class FileDemo06 {
    public static void main(String args[]){
        File file = new File("d:\\11game");
        File f[] = file.listFiles();
        long now_1 = System.currentTimeMillis();
        if (true) {
            for (int j = 0; j < f.length; j++) {
                final int a = j;                      //不将j fanal 会报错
                new Thread() {
                    public void run() {
                        print(f[a]);
                    }
                }.start();
            }
        }
       // print (file);
        long now_2 = System.currentTimeMillis();
        long time = now_2-now_1;
        System.out.println(time+"mills");
    }
    public static void print(File file){
        if(file != null){
            if(file.isDirectory()){
                File f[] = file.listFiles();
                if(f != null){
                    for(int i = 0 ; i<f.length;i++){
                        print(f[i]);
                    }
                }
            }
            else{
                x++;
                System.out.println(file+"\t"+x);
            }
        }
    }
    public static int x = 0;
}
