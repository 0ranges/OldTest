package Arithmetic.JichuTimu;

import java.util.Scanner;

/**
 * Created by user on 2017/4/19.
 */
/*
把手放在键盘上，稍不注意就会往右错一位。
这样的话，Q会变为W，J会变为K。
输入一个错位后的敲出的字符串，输出本来的字符串
例子：
输入：O S, GOMR YPFSU/
输出：I AM FINE TODAY.
 */
public class Example01 {
    public static void main(String[] args) {
        String real = "`1234567890-=QWERTYUIOP[]\\ASDFGHJKL;'ZXCVBNM,./";
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
//        System.out.println(String.valueOf(str.charAt(0)));
//        System.out.println(real.contains(String.valueOf(str.charAt(0))));
        for(int i = 0;i<str.length();i++){
            if(real.contains(String.valueOf(str.charAt(i)))) {
                for (int j = 1; j < real.length(); j++) {
                    if (String.valueOf(str.charAt(i)).equals(String.valueOf(real.charAt(j))))
                        System.out.print(real.charAt(j - 1));
                }
            }else{
                System.out.print(" ");
            }
        }
    }
}
