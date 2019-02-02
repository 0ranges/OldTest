package leetcode.medium;

import java.util.HashSet;

/**
 * Created by user on 2018/4/15.
 */
public class Q565 {
    public int arrayNesting(int[] nums) {
        int res = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            if(set.add(i)){
                int n = i;
                int max = 1;
                while(set.add(nums[n])) {
                    max++;
                    n = nums[n];
                }
                res = Math.max(res,max);
            }
        }
        return res;
    }
}
