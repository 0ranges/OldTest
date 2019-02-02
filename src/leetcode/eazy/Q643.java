package leetcode.eazy;

/**
 * Created by user on 2018/4/11.
 */
public class Q643 {
    public double findMaxAverage(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        for( int i = 0;i<nums.length-k+1;i++) {
            int res = 0;
            for(int j =0;j<k;j++){
                res+=nums[i+j];
            }
            max = Math.max(res,max);
        }
        return (double)max/(double)k;
    }
}
