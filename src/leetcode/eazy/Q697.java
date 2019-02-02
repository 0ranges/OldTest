package leetcode.eazy;

import java.util.*;

/**
 * Created by user on 2018/4/19.
 */
public class Q697 {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            if(!map.containsKey(i))
                map.put(i,1);
            else
                map.replace(i,map.get(i)+1);
        }
        int[][] arr = new int[map.size()][2];
        int i = 0;
        Set<Integer> set = map.keySet();
        for(int a:set){
            arr[i][0] = a;
            arr[i++][1] = map.get(a);
        }
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1]>o2[1])
                    return -1;
                else if(o1[1]==o2[1])
                    return 0;
                else
                    return 1;
            }
        });
        int res = Integer.MAX_VALUE;
        i = 0;
        int a = arr[i][1];
        int max = 0;
        int min = 0;
        while(i<map.size()&&arr[i][1] == a){
            for(int j = 0;j<nums.length;j++) {
                if (nums[j] == arr[i][0]) {
                    min = j;
                    break;
                }
            }
            for(int j = nums.length-1;j>=0;j--) {
                if (nums[j] == arr[i][0]) {
                    max = j;
                    break;
                }
            }
            res = Math.min(res,max-min+1);
            i++;
        }
        return res;
    }
}
