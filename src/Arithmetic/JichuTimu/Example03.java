package Arithmetic.JichuTimu;

import java.util.Scanner;

/**
 * Created by user on 2017/4/19.
 */
/*
如果一个字符串可以由某个长度为k的字符串重复多次取得，我们说该串以k为周期。
例如，abcabcabcabc以3为周期。
输入一个长度不超过80的串，输出它的最小周期。
例子：
输入：HoHoHo
输出：2
 */
public class Example03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        int len = str.length();
        for(int i = 1;i<=len;i++) if(len%i==0){
            boolean ok = true;
            for(int j = i;j<len;j++){
                if(str.charAt(j) != str.charAt(j%i)){
                    ok = false;
                    break;
                }
            }
            if(ok){
                System.out.printf("%d",i);
                break;
            }
        }
    }
}
