package leetcode.eazy;

import java.util.Arrays;

/**
 * Created by user on 2018/8/13.
 */
public class Q561 {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        for(int i = 0;i<nums.length;i += 2){
            res += nums[i];
        }
        return res;
    }
}
