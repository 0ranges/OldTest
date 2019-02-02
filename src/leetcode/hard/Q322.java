package leetcode.hard;

import java.util.Arrays;

/**
 * Created by user on 2018/4/15.
 */
public class Q322 {
    public static void main(String[] args) {
        System.out.println(coinChange(new int[]{1,2,5},11));
    }
    public static int coinChange(int[] coins, int amount) {
        int[] res = new int[amount+1];
        Arrays.fill(res,Integer.MAX_VALUE);
        for(int i:coins)
            if(i<=amount)
               res[i] = 1;
        res[0] = 0;
        for(int i = 1;i<=amount;i++){
            for(int j = 0;j<coins.length;j++){
                if(i > coins[j]&&res[i-coins[j]]!=Integer.MAX_VALUE)
                    res[i] = Math.min(res[i],res[i-coins[j]]+1);
            }
        }
        return res[amount] == Integer.MAX_VALUE?-1:res[amount];
    }
}
