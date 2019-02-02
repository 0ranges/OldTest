package leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by user on 2017/10/10.
 */
public class Q347 {
    public static void main(String[] args) {
        System.out.println(topKFrequent(new int[]{1,1,1,2,2,3},2));
    }
    public static List<Integer> topKFrequent(int[] nums, int k) {
        if(k == 0)
            return null;
        List<Integer> res = new ArrayList<>();
        Arrays.sort(nums);
        int count = 1;
        for(int i = 1;i < nums.length;i++){
            if(nums[i] != nums[i - 1])
                count ++ ;
        }
        int[][] a = new int[count][2];
        count = 0;
        a[count][0] = nums[0];
        a[count][1] = 1;
        for(int i = 1;i < nums.length;i++) {
            a[count][0] = nums[i - 1];
            if (nums[i] != nums[i - 1]) {
                count++;
                a[count][0] = nums[i];
                a[count][1] = 1;
            }
            else{
                a[count][1] ++;
            }
        }
        Arrays.sort(a, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[1] - o1[1];
            }
        });
        for(int i = 0;i < k;i++)
            res.add(a[i][0]);
        return res;
    }
}
