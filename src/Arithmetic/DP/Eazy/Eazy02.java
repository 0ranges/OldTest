package Arithmetic.DP.Eazy;

import java.util.Scanner;

/**
 * Created by user on 2017/9/10.
 */
/*

母牛的故事

Problem Description
有一头母牛，它每年年初生一头小母牛。每头小母牛从第四个年头开始，每年年初也生一头小母牛。请编程实现在第n年的时候，共有多少头母牛？


Input
输入数据由多个测试实例组成，每个测试实例占一行，包括一个整数n(0<n<55)，n的含义如题目中描述。
n=0表示输入数据的结束，不做处理。


Output
对于每个测试实例，输出在第n年的时候母牛的数量。
每个输出占一行。


Sample Input
2
4
5
0


Sample Output
2
4
6

 */
public class Eazy02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int num[][] = new int[n+1][2];
        num[1][0] = 1;
        num[1][1] = 1;
        for(int i = 2;i<=n;i++){
            num[i][0] = num[i-1][0];
            if(i>4) {
                num[i][0] += num[i - 3][0];
            }
            num[i][1] = num[i-1][1]+num[i][0];
        }
        System.out.println(num[n][1]);
    }
}
