package leetcode.medium;

/**
 * Created by user on 2018/8/7.
 */
public class Q376 {
    public int wiggleMaxLength(int[] nums) {
        int n = nums.length;
        for(int i = 0;i<n-1;i++){
            nums[i] -= nums[i+1];
        }
        int res = 1;
        return res;
    }
}
