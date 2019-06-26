package leetcode.eazy;

import java.util.Arrays;

/**
 * @author : oranges
 * @title : leetcode.eazy
 * @date : 2019/2/28 19:33
 * @description :
 */
public class Q169 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
