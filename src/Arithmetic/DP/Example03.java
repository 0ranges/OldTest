package Arithmetic.DP;

import java.util.Scanner;

/**
 * Created by user on 2017/5/31.
 */
/*
最长公共子序列
Sample Input

abcfbc abfcab
programming contest
abcd mnp

Sample Output

4
2
0
 */
public class Example03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1 = input.next();
        String str2 = input.next();
        int n = str1.length();
        int m = str2.length();
        int max[][] = new int[n][m];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(i==0||j==0){
                    if(str1.charAt(i) == str2.charAt(j))
                        max[i][j] = 1;
                    else
                        max[i][j] = 0;
                }else {
                    if(str1.charAt(i) == str2.charAt(j))
                        max[i][j] = max[i-1][j-1]+1;
                    else
                        max[i][j] = Math.max(max[i][j-1],max[i-1][j]);
                }
            }
        }
        System.out.println(max[n-1][m-1]);
    }
}
