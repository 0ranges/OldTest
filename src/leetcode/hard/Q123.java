package leetcode.hard;

/**
 * Created by user on 2018/4/17.
 */
public class Q123 {
    //方法超时
    public int maxProfit01(int[] prices) {
        if(prices.length<2)
            return 0;
        int n = prices.length;
        int[] arr = new int[n-1];
        for(int i = 0;i<arr.length;i++)
            arr[i] = prices[i+1]-prices[i];
        int max = nmMaxProfit(arr,0,arr.length);
        for(int i = 1;i<arr.length-1;i++){
            max = Math.max(max,nmMaxProfit(arr,0,i)+nmMaxProfit(arr,i+1,arr.length));
        }
        return max;
    }
    public int nmMaxProfit(int[] arr,int n,int m){
         int max = 0;
         int res = 0;
         for(int i = n;i<m;i++){
             max += arr[i];
             if(max>0)
                 res = Math.max(max,res);
             else
                 max = 0;
         }
         return res;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit02(new int[]{2,1,4}));
    }
    public static int maxProfit02(int[] prices) {
        int n = prices.length;
        if(n<2)
            return 0;
        int[] A = new int[n];
        int[] B = new int[n];
        int minPrice = prices[0];
        for(int i = 1;i<n;i++){
            A[i] = Math.max(A[n-1],prices[i]-minPrice);
            minPrice = Math.min(prices[i],minPrice);
        }
        int maxPrice = prices[n-1];
        for(int i =n-2;i>=0;i--){
            B[i] = Math.max(B[i+1],maxPrice-prices[i]);
            maxPrice = Math.max(prices[i],maxPrice);
        }
        int res = 0;
        for(int i = 0;i<n-1;i++){
            res = Math.max(res,A[i]+B[i+1]);
        }
        res = Math.max(res,A[n-1]);
        return res;
    }
}
