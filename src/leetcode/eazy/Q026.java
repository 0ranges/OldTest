package leetcode.eazy;

/**
 * Created by user on 2018/3/27.
 */
public class Q026 {
    public int removeDuplicates(int[] nums) {
        int start = 1;
        int index = 1;
        while(start<nums.length){
            boolean flag = true;
            for(int i = index-1;i>=0;i++){
                if(nums[start] == nums[i]){
                    start++;
                    flag = false;
                    break;
                }
            }
            if(flag)
                nums[index++] = nums[start++];
        }
        return index;
    }
}
