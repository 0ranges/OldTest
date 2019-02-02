package leetcode.medium;

import java.util.Arrays;

/**
 * Created by user on 2018/1/4.
 */
public class Q698 {
    public static void main(String[] args) {
        System.out.println(canPartitionKSubsets(new int[]{5,2,5,5,5,5,5,5,5,5,5,5,5,5,5,3},15));
    }
    public static boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = 0;
        for(int i:nums)
            sum+=i;
        if(sum%k != 0)
            return false;
        int[] visit = new int[nums.length];
        return canPartition(nums,visit,0,k,0,0,sum/k);
    }
    public static boolean canPartition(int[] nums,int[] visit,int start,int k,int sum,int total,int target){
        if(k == 1)
            return true;
        if(sum == target && total>0)
            return canPartition(nums,visit,0,k-1,0,0,target);
        for(int i = start;i<nums.length;i++){
            if(visit[i] == 0){
                visit[i] = 1;
                if(canPartition(nums,visit,i+1,k,sum+nums[i],total+1,target))
                    return true;
                visit[i] = 0;
            }
        }
        return false;
    }
}
