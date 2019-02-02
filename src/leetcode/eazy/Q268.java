package leetcode.eazy;

/**
 * Created by user on 2017/8/20.

 Missing Number

 Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

 For example,
 Given nums = [0, 1, 3] return 2.

 Note:
 Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?

 Credits:
 Special thanks to @jianchao.li.fighter for adding this problem and creating all test cases.
 */
public class Q268 {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for(int num:nums)
            sum += num;
        int n = nums.length;
        int sum1 = (n+1)*n/2;
        return sum1 - sum;
    }
}
