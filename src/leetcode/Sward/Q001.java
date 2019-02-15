package leetcode.Sward;

/**
 * @author : oranges
 * @title : leetcode.Sward
 * @date : 2019/2/14 17:59
 * @description :
 * 在一个长度为 n 的数组里的所有数字都在 0 到 n-1 的范围内。
 * 数组中某些数字是重复的，但不知道有几个数字是重复的，也不知
 * 道每个数字重复几次。请找出数组中任意一个重复的数字。
 * Input:
 * {2, 3, 1, 0, 2, 5}
 * utput:
 * 2
 */
public class Q001 {
    public boolean duplicate(int[] nums, int length, int[] duplication) {
        if(nums == null || nums.length <= 1){
            return false;
        }
        for(int i = 0;i < nums.length;i++){
            while(nums[i] != i){
                if(nums[i] == nums[nums[i]]){
                    duplication[0] = nums[i];
                    return true;
                }
                swap(nums,nums[i],i);
            }
        }
        return false;
    }
    public void swap(int[] nums,int i,int j){
        int num = nums[i];
        nums[i] = nums[j];
        nums[j] = num;
    }
}
