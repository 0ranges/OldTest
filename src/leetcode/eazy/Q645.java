package leetcode.eazy;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by user on 2017/9/8.
 */
public class Q645 {
    public int[] findErrorNums(int[] nums) {
        int need[] = new int[2];
        int sum = 0;
        int len = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i:nums) {
            sum += i;
            if(set.contains(i))
                need[0] = i;
            else
                set.add(i);
        }
        need[1] = len*(len+1)/2-(sum-need[0]);
        return need;
    }
}
