package leetcode.eazy;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by user on 2017/9/20.
 */
public class Q219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        if(n<2)
            return false;
        HashMap<Integer,Integer> set = new HashMap<>();
        set.put(nums[0],0);
        for(int i = 1;i<n;i++){
            if(set.containsKey(nums[i])){
                if(i-set.get(nums[i])<=k)
                    return true;
                else{
                    set.remove(nums[i]);
                    set.put(nums[i],i);
                }
            }
            set.put(nums[i],i);
        }
        return false;
    }
}
