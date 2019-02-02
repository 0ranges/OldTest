package leetcode.eazy;

/**
 * Created by user on 2018/4/23.
 */
public class Q283 {
    public void moveZeroes(int[] nums) {
        int num = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == 0)
                num++;
            else if(num != 0){
                nums[i-num] = nums[i];
                nums[i] = 0;
            }
        }
    }
}
