package leetcode.medium;

/**
 * Created by user on 2018/8/1.
 */
public class Q334 {
    public boolean increasingTriplet(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MAX_VALUE;
        for(int i : nums){
            if(i <= min)
                min = i;
            else if(i <= max)
                max = i;
            else
                return true;
        }
        return false;
    }
}
