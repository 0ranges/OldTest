package leetcode.Sward;

/**
 * @author : oranges
 * @title : leetcode.Sward
 * @date : 2019/2/17 20:02
 * @description :
 * 把一根绳子剪成多段，并且使得每段的长度乘积最大。
 * n = 2
 * return 1 (2 = 1 + 1)
 * n = 10
 * return 36 (10 = 3 + 3 + 4)
 *
 * 尽可能多剪长度为 3 的绳子，并且不允许有长度为 1
 * 的绳子出现。如果出现了，就从已经切好长度为 3 的
 * 绳子中拿出一段与长度为 1 的绳子重新组合，把它们
 * 切成两段长度为 2 的绳子。
 *
 * 证明：当 n >= 5 时，3(n - 3) - n = 2n - 9 > 0，
 * 且 2(n - 2) - n = n - 4 > 0。因此在 n >= 5 的情
 * 况下，将绳子剪成一段为 2 或者 3，得到的乘积会更大。
 * 又因为 3(n - 3) - 2(n - 2) = n - 5 >= 0，所以剪
 * 成一段长度为 3 比长度为 2 得到的乘积更大。
 *
 */
public class Q011 {
    public int integerBreak(int n) {
        if(n < 2){
            return 0;
        }
        if(n == 2){
            return 1;
        }
        if(n == 3){
            return 2;
        }
        int timeOf3 = n / 3;
        if(n - timeOf3 * 3 == 1){
            timeOf3 --;
        }
        int timeOf2= (n - timeOf3 * 3) / 2;
        return (int)Math.pow(3,timeOf3) * (int)Math.pow(2,timeOf2);
    }
    //DP
    public int integerBreak02(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;
        for(int i = 2;i <= n;i++){
            for(int j = 1;j < i;j++){
                dp[i] = Math.max(dp[i],Math.max(j * (i - j),dp[j] * dp[i - j]));
            }
        }
        return dp[n];
    }
}
