package leetcode.medium;

/**
 * Created by user on 2018/7/23.
 */
public class Q279 {
    public static void main(String[] args) {
        System.out.println(numSquares(12));
    }
    public static int numSquares(int n) {
        int[] result = new int[n+1];
        for(int i = 1;i<=n;i++){
            result[i] = i;
        }
        for(int i = 1; i*i <= n;i++){
            result[i*i] = 1;
        }
        for(int i = 2 ; i <= n ; i++ ){
            for(int j = 1;j<=i/2;j++){
                result[i] = Math.min(result[i],result[j]+result[i-j]);
            }
        }
        return result[n];
    }
}

