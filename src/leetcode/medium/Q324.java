package leetcode.medium;

import java.util.Arrays;

/**
 * Created by user on 2017/9/15.
 */
public class Q324 {
    public static void wiggleSort(int[] nums) {
        int len = nums.length;
        int nums_[] = Arrays.copyOf(nums,len);
        Arrays.sort(nums_);
        int index = 0;
        if(len%2 == 1){
            for(int i = len/2;i>=0;i--){
                nums[index] = nums_[i];
                index++;
                if(index == len)
                    break;
                nums[index] = nums_[i+len/2];
                index++;
            }
        }
        else{
            for(int i = len/2-1;i>=0;i--){
                nums[index] = nums_[i];
                index++;
                nums[index] = nums_[i+len/2];
                index++;
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = new int[]{4,5,5,6};
        wiggleSort(nums);

    }
}
