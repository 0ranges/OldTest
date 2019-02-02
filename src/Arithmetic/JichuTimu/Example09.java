package Arithmetic.JichuTimu;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by user on 2017/4/20.
 */
/*
因子和阶乘
输入正整数n（2<=n<=100），把阶乘n!=1*2*3*4*...*n分解成素因子相乘的形式，
从小到大输出个个素数(2,3,5...)的指数，如825=3*5*5*11应表示为（0,1,2,0,1），
忽略比最大素因子更大的素数
例子：
输入：
5
53
输出：
5!=3 1 1
53!=49 23 12 8 4 4 3 2 2 1 1 1 1 1 1 1
*/
public class Example09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int prime[] = new int[100];
        int count = 0;
        for(int i = 2;i<100;i++){
            if(isPrime(i))
                prime[count++]=i;
        }
        int max = 0;
        int p[] = new int[count];
        Arrays.fill(p,0);
        for(int j = 1;j<=num;j++) {
            int m = j;
            for (int i = 0; i < count; i++) {
                while (m % prime[i] == 0) {
                    m /= prime[i];
                    p[i]++;
                    if(i > max){
                        max = i;
                    }
                }
            }
        }
        System.out.printf("%d!=",num);
        for(int i = 0;i<=max;i++){
            System.out.printf("%d ",p[i]);
        }
    }
    public static boolean isPrime(int a){
        for(int i = 2;i*i<=a;i++){
            if(a%i==0)
                return false;
        }
        return true;
    }
}
