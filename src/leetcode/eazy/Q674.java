package leetcode.eazy;

/**
 * Created by user on 2018/8/6.
 */
public class Q674 {
    public int findLengthOfLCIS(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;
        int res = 1;
        int max = 1;
        for(int i = 1;i<nums.length;i++){
            if(nums[i] > nums[i-1]){
                max ++;
            }else{
                res = Math.max(max,res);
                max = 1;
            }
        }
        res = Math.max(max,res);
        return res;
    }
}
