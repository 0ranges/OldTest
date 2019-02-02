package Arithmetic;

import java.util.Scanner;

/**
 * Created by user on 2017/4/15.
 */
/*
* 求两个数的最大公约数
* xtfggef 2012/5/16
*/
public class Maxgys {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println(num1+"和"+num2+"的最大公约数为："+gcd(num1,num2));
    }
    public static int gcd(int a,int b){
        while(a!=b){
            if(a>b)
                a = a-b;
            else
                b = b-a;
        }
        return a;
    }
}
