package leetcode.medium;

import edu.princeton.cs.algs4.In;

/**
 * Created by user on 2017/12/22.
 */
public class Q714 {
    public int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        int[] result = new int[n+1];
        int index = 0;
        int[][] memory = new int[n+1][n+1];
        for(int i =2;i<=n;i++){
            for(int j = 1;j<i;j++){
                for(int k = j+1;k<=i;k++){
                    memory[j][i] = Math.max(prices[k-1]-prices[j-1],memory[j][i]);
                }
            }
        }
        for(int i = 2;i<=n;i++){
            for(index = 0;index<i-1;index++){
                result[i] = Math.max(result[i],memory[index+1][i]-fee+result[index]);
            }
        }
        return result[n];
    }

    public int max(int[] prices,int fee){
        int l = prices.length;
        int[] hold = new int[l + 1]; //Hold the stock until day i;
        int[] notHold = new int[l + 1]; //Do not hold the stock until day i;
        hold[0] = Integer.MIN_VALUE;

        for (int i = 1; i <= l; i++) {
            hold[i] = Math.max(hold[i - 1], notHold[i - 1] - prices[i - 1] - fee);
            notHold[i] = Math.max(notHold[i - 1], hold[i - 1] + prices[i - 1]);
        }

        return notHold[l];
    }
    public static void main(String[] args) {
        System.out.println(new Q714().maxProfit(new int[]{1,3,7,5,10,3},3));
    }
}
