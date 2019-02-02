package leetcode.eazy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 2018/8/14.
 */
public class Q594 {
    public static void main(String[] args) {
        System.out.println(findLHS(new int[]{1,3,5,7,9,11,13,15,17}));
    }
    public static int findLHS(int[] nums) {
        Arrays.sort(nums);
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            if(map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            }else {
                map.put(i, 1);
            }
        }
        int res = 0;
        for(int i = 0;i < nums.length-1;i++){
            if(map.containsKey(nums[i]) && map.containsKey(nums[i]+1)) {
                res = Math.max(res, map.get(nums[i]) + map.get(nums[i] + 1));
            }
        }
        return res;
    }
}

