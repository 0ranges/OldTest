package leetcode.eazy;

/**
 * Created by user on 2018/4/1.
 */
public class Q122 {
    public int maxProfit(int[] prices) {
        if(prices == null||prices.length == 0)
            return 0;
        int res = 0;
        for(int i = 1;i<prices.length;i++) {
            int profit = prices[i] - prices[i - 1];
            if(profit > 0)
                res+=profit;
        }
        return res;
    }
}
