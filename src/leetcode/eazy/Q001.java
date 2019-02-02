package leetcode.eazy;

import java.util.Arrays;

/**
 * Created by user on 2017/8/15.

 Two Sum

 Given an array of integers, return indices of the two numbers such that they add up to a specific target.

 You may assume that each input would have exactly one solution, and you may not use the same element twice.

 Example:
 Given nums = [2, 7, 11, 15], target = 9,

 Because nums[0] + nums[1] = 2 + 7 = 9,
 return [0, 1].

 */
public class Q001 {
    public int[] twoSum(int[] nums, int target) {
        int[] add = new int[2];
        for(int i = 0;i<nums.length;i++){
            if(nums[i]>=target)
                continue;
            for(int j = i+1;j<nums.length;j++){
                if(nums[j]>=target)
                    continue;
                if(nums[i]+nums[j]==target){
                    add[0] = i;
                    add[1] = j;
                    break;
                }
            }
        }
        return add;
    }
}
