package JAVA.IOTest;

import java.io.File;
import java.util.Scanner;

/**
 * Created by user on 2017/4/12.
 */
public class ScannerDemo02 {
    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(new File("D:\\text.txt"));
        StringBuffer str = new StringBuffer();
        while(input.hasNext()){
            str.append(input.next()).append("\n");
        }
        System.out.println(str);
    }
}
