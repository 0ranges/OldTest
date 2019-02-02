package leetcode.eazy;

/**
 * Created by user on 2018/8/7.
 */
public class Q121 {
    public int maxProfit(int[] prices) {
        for(int i = prices.length - 1;i > 0;i-- ){
            prices[i] -= prices[i-1];
        }
        int max = 0;
        int res = 0;
        for(int i  = 1;i<prices.length;i++){
            res += prices[i];
            max = Math.max(res,max);
            if(res < 0)
                res = 0;
        }
        return max;
    }
}
