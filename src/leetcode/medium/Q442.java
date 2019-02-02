package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 2017/12/16.
 */
public class Q442 {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        for(int i = 0;i<n;i++){
            while(nums[i] != i+1&&nums[nums[i]-1] != nums[i]) {
                int temp = nums[nums[i]-1];
                nums[nums[i]-1] = nums[i];
                nums[i] = temp;
            }
        }
        for(int i = 0;i<n;i++){
            if(i != nums[i]-1)
                result.add(nums[i]);
        }
        return result;
    }
}
