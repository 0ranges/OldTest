package Arithmetic.Baoliqiujie;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

/**
 * Created by user on 2017/4/25.
 */
/*
最大乘积
输入n个元素组成的序列S，你需要找出一个乘积最大的连续子序列
如果这个最大的乘积不是整数，应输出-1（表示无解），1<=n<=18,-10<=Si<=10
例子：
输入：
3
2 4 -3
5
2 5 -1 2 -1
输出：
8
20
 */
public class Example02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int s[] = new int[n];
        for(int i = 0;i<n;i++){
            s[i] = input.nextInt();
        }
        int r[] = new int[(n-1)*n/2];
        int index = 0;
        for(int i = 0;i<n-1;i++){
            for(int j = i+1;j<n;j++){
                int r_result = 1;
                for(int k = i;k<=j;k++){
                    r_result *= s[k];
                }
                r[index++] = r_result;
            }
        }
        Arrays.sort(r);
        System.out.printf("%d\n", r[r.length-1]);
    }
}
