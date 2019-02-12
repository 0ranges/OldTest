package leetcode.medium;

import java.util.Arrays;

/**
 * @author : oranges
 * @title : leetcode.medium
 * @date : 2019/2/12 20:55
 * @description :
 */
public class Q503 {
    public int[] nextGreaterElements(int[] nums) {
        if(nums == null){
            return null;
        }
        int n = nums.length;
        int[] res = new int[nums.length];
        Arrays.fill(res,-1);
        for(int i = 0;i < n;i++){
            for(int j = i + 1;j < i+n;j ++){
                if(nums[j%n] > nums[i]){
                    res[i] = nums[j%n];
                    break;
                }
            }
        }
        return res;
    }
}
