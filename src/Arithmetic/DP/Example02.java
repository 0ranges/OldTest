package Arithmetic.DP;

import java.util.Scanner;

/**
 * Created by user on 2017/5/30.
 */
/*
最长上升子序列
输入数据
输入的第一行是序列的长度N (1 <= N <= 1000)。第二行给出
序列中的N个整数，这些整数的取值范围都在0到10000。
输出要求
最长上升子序列的长度。
输入样例
7
1 7 3 5 9 4 8
输出样例
4
 */
public class Example02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a[] = new int[n];
        for(int i = 0 ;i<n;i++)
            a[i] = input.nextInt();
        int max[] = new int[n];
        max[0] = 1;
        for(int i = 1;i<n;i++){
            for(int j = 0;j<i;j++){
                if(a[i]>a[j])
                    max[i] = Math.max(max[i],max[j]+1);
            }
        }
        int x = 0;
        for(int i:max){
            if(i>x)
                x=i;
        }
        System.out.println(x);
    }
}
