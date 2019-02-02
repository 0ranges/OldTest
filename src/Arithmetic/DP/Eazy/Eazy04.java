package Arithmetic.DP.Eazy;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by user on 2017/9/12.
 */
/*
给你一个硬币，抛掷n次，问出现连续至少k个正面向上的情况有多少种。

转换成抛N次至多连续有N个减去抛N次至多连续有K-1个1的情况 dp[i][k]表示抛i次至多连续有k个1的情况数;
 */
public class Eazy04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        BigInteger[][] dp = new BigInteger[105][105];
        for(int i=0; i<=100; ++i) {
            dp[0][i]=new BigInteger("1");
            for(int j=1; j<=100; ++j) {
                dp[j][i]=new BigInteger("0");
                if(j<=i) dp[j][i]=dp[j-1][i].add(dp[j-1][i]);
                else if(j==i+1) dp[j][i]=dp[j-1][i].add(dp[j-1][i].subtract(new BigInteger("1")));
                else dp[j][i]=dp[j-1][i].add(dp[j-1][i].subtract(dp[j-i-2][i]));
            }
        }
        System.out.println(dp[n][n].subtract(dp[n][k-1]));
    }
}
