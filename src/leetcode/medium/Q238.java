package leetcode.medium;

/**
 * Created by user on 2018/8/6.
 */
public class Q238 {
    public int[] productExceptSelf(int[] nums) {
        int total = 1;
        int zeros = 0;
        for(int i : nums) {
            if(i == 0)
                zeros ++;
            else
                total *= i;
        }
        for(int i = 0 ; i < nums.length;i++){
            if(zeros > 1)
                nums[i] = 0;
            else if(zeros == 1){
                nums[i] = nums[i] == 0 ? total : 0;
            }
            else
                nums[i] = total / nums[i];
        }
        return nums;
    }
}
