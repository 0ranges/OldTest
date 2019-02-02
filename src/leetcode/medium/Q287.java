package leetcode.medium;

/**
 * Created by user on 2017/12/16.
 */
public class Q287 {
    public int findDuplicate(int[] nums) {
        for(int i = 0;i<nums.length;i++){
            int temp = Math.abs(nums[i]);
            if(nums[temp]>0)
                nums[temp] = 0-nums[temp];
            else if(nums[temp]<0)
                return temp;
        }
        return 0;
    }
}
