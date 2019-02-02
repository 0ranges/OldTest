package JAVA.IOTest;

import java.util.Scanner;

/**
 * Created by user on 2017/4/12.
 */
public class ScannerDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入：");
        input.useDelimiter("\n");
        String str = input.next();
        System.out.print("输入为："+str);
    }
}
