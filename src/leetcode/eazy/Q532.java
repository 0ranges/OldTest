package leetcode.eazy;

import java.util.Arrays;

/**
 * Created by user on 2017/12/16.
 */
public class Q532 {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int count = 0;
        for(int i = 0;i<n-1;i++){
            if(i>0&&nums[i]==nums[i-1])
                continue;
            int start = nums[i];
            for(int j = i+1;j<n;j++){
                if(nums[j]-nums[i] == k) {
                    count++;
                    break;
                }
                else if(nums[j]-nums[i] > k)
                    break;
            }
        }
        return count;
    }
}
