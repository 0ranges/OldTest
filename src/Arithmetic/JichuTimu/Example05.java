package Arithmetic.JichuTimu;

import java.sql.Struct;
import java.util.Scanner;

/**
 * Created by user on 2017/4/20.
 */
/*
阶乘的精确值
输入不超过1000的正整数，输出n!=1*2*3*4*...*n的精确结果。
例子：
输入：30
输出：265252859812191058636308480000000
 */
public class Example05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int f[] = new int[3000];
        f[0] = 1;
        for(int i = 2;i<=num;i++){
            int count = 0;
            for(int j = 0;j<f.length;j++){
                int a = f[j]*i+count;
                f[j] = a%10;
                count = a/10;
            }
        }
        int index = 0;
        for(int i = f.length-1;i>=0;i--){
            if(f[i]!=0){
                index = i;
                break;
            }
        }
        for(int i = index;i>=0;i--){
            System.out.printf("%d",f[i]);
        }
    }
}