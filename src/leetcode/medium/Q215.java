package leetcode.medium;

import java.util.Arrays;

/**
 * Created by user on 2018/4/12.
 */
public class Q215 {
    public static void main(String[] args) {
        System.out.println(findKthLargest(new int[]{-1,2,0},2));
    }
    public static int findKthLargest(int[] nums, int k) {
        int[] lower = new int[nums.length];
        int[] higher = new int[nums.length];
        int low = 0;
        int high = 0;
        int mid = nums[0];
        for(int i = 1;i<nums.length;i++){
            if(nums[i]<mid)
                lower[low++] = nums[i];
            else
                higher[high++] = nums[i];
        }
        if(k == high+1)
            return mid;
        else if(k<high+1) {
            higher = Arrays.copyOf(higher,high);
            return findKthLargest(higher, k);
        }
        else {
            lower = Arrays.copyOf(lower,low);
            return findKthLargest(lower, k - high - 1);
        }
    }
}
