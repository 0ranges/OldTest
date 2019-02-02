package leetcode.medium;

import java.util.Arrays;

/**
 * Created by user on 2018/4/23.
 */
public class Q462 {
    public int minMoves2(int[] nums) {
        int lo = 0;
        int hi = nums.length-1;
        int res = 0;
        Arrays.sort(nums);
        while(hi>lo)
            res += nums[hi--]-nums[lo++];
        return res;
    }
}
