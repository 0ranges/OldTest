package leetcode.medium;

import java.util.Arrays;

/**
 * Created by user on 2017/12/22.
 */
public class Q740 {
    public int deleteAndEarn(int[] nums) {
        if(nums.length == 0)
            return 0;
        Arrays.sort(nums);
        int[] a = new int[nums[nums.length-1]+1];
        int index = 0;
        for(int i = nums[0];i<=nums[nums.length-1];i++){
            int all = 0;
            if(index<nums.length) {
                for(int j = index;j<nums.length;j++){
                    if(nums[j] == i)
                        all+=i;
                    else {
                        index = j;
                        break;
                    }
                }
            }
            if(i == 1){
                a[i] = all;
                continue;
            }
            a[i] = Math.max(a[i-1],a[i-2]+all);
        }
        return a[a.length-1];
    }
    public int deleteAndEarn01(int[] nums) {
        int[] count = new int[10001];
        for(int n : nums){
            count[n] += n;
        }
        int[] dp = new int[10003];
        for(int i = 10000; i >= 0; i--) {
            dp[i] = Math.max(count[i] + dp[i + 2], dp[i + 1]);
        }
        return dp[0];
    }
    public static void main(String[] args) {
        System.out.println(new Q740().deleteAndEarn(new int[]{1,1,1,2,4,5,5,5,6}));
    }
}
