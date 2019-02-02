package leetcode.medium;

import java.util.Arrays;

/**
 * Created by user on 2018/3/20.
 */
public class Q377 {
    public static void main(String[] args) {
        System.out.println(combinationSum4(new int[]{1,2,3},4));
    }
    public static int combinationSum4(int[] nums, int target) {
        if(nums.length == 0)
            return 0;
        Arrays.sort(nums);
        int[] a = new int[target+1];
        int index = 0;
        for(int i = nums[0];i<=target;i++){
            if(index<nums.length&&i == nums[index]) {
                a[i] = 1;
                index++;
            }
            int j = 0;
            while(j<nums.length&&nums[j]<i){
                a[i]+=a[i-nums[j]];
                j++;
            }
        }
        return a[target];
    }
}
