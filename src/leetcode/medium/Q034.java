package leetcode.medium;

/**
 * Created by user on 2018/7/31.
 */
public class Q034 {
    public static void main(String[] args) {
        int res[] = searchRange(new int[]{2,2},2);
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        if(nums.length == 0){
            res = new int[]{-1,-1};
            return res;
        }
        int lo = 0;
        int hi = nums.length-1;
        int mid = 0;
        while(lo <= hi){
            mid = lo + (hi - lo) / 2;
            if(target <= nums[mid])
                hi = mid - 1;
            else
                lo = mid + 1;
        }
        res[0] = lo < nums.length  && nums[lo] == target ? lo:-1;
        lo = 0;
        hi = nums.length-1;
        while(lo <= hi){
            mid = lo + (hi - lo) / 2;
            if(target >= nums[mid])
                lo = mid + 1;
            else
                hi = mid - 1;
        }
        res[1] = hi >= 0 && nums[hi] == target ? hi : -1;
        return res;
    }
}
