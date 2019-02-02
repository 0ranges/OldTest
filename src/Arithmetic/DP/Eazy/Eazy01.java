package Arithmetic.DP.Eazy;

/**
 * Created by user on 2017/9/10.
 */

import java.util.Scanner;

/**
 *

 数塔

 Input
 输入数据首先包括一个整数C,表示测试实例的个数，每个测试实例的第一行是一个整数N(1 <= N <= 100)，表示数塔的高度，接下来用N行数字表示数塔，其中第i行有个i个整数，且所有的整数均在区间[0,99]内。
 Output
 对于每个测试实例，输出可能得到的最大和，每个实例的输出占一行。
 Sample Input
 1
 5
 7
 3 8
 8 1 0
 2 7 4 4
 4 5 2 6 5
 Sample Output
 30

 */
public class Eazy01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int num[][] = new int[n][n];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<=i;j++){
                num[i][j] = input.nextInt();
            }
        }
        int result[] = new int[n];
        for(int i = n ;i>0;i--){
            if(i == n){
                for(int j = 0;j<i;j++)
                    result[j] = num[i-1][j];
            }else{
                for(int j = 0;j<i;j++)
                    result[j] = num[i-1][j]+Math.max(result[j],result[j+1]);
            }
        }
        System.out.println(result[0]);
    }
}
