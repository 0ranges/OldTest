package leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by user on 2018/8/16.
 */
public class Q228 {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        int n = nums.length;
        if(n == 0)
            return res;
        if(n == 1){
            res.add("" + nums[0]);
            return res;
        }
        int lo;
        int hi;
        int count;
        for(int i = 0;i < n;i++){
            lo = nums[i];
            hi = nums[i];
            while(i < n-1 && nums[i + 1] <= nums[i] + 1) {
                hi = nums[i+1];
                i++;
            }
            if(hi == lo)
                res.add("" + hi);
            else
                res.add(lo + "->" + hi);
        }
        return res;
    }
}
