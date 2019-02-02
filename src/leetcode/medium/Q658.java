package leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by user on 2017/12/18.
 */
public class Q658 {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int lo = 0;
        int hi = arr.length-k;
        while (lo<hi){
            int mid = lo+(hi-lo)/2;
            if(x - arr[mid]>arr[mid+k]-x)
                lo = mid+1;
            else
                hi = mid;
        }
        List<Integer> result = new ArrayList<>();
        for(int i = lo;i<lo+k;i++)
            result.add(arr[i]);
        return result;
    }
}
