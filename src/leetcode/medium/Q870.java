package leetcode.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *@author : oranges
 *@date : 2018/8/22 16:44
 */

public class Q870 {
    public int[] advantageCount(int[] A, int[] B) {
        int n = A.length;
        int[] temp = new int[n];
        temp = Arrays.copyOf(A,n);
        Arrays.sort(temp);
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : temp){
            if(!map.containsKey(i)) {
                map.put(i, 0);
            }
            map.put(i,map.get(i) + 1);
        }
        for(int i = 0;i < n;i++){
            int j = search(B[i],temp);
            j %= n;
            while(map.get(temp[j]) == 0){
                j ++;
                if(j == n){
                    j = 0;
                }
            }
            A[i] = temp[j];
            map.put(temp[j],map.get(temp[j]) - 1);
        }
        return A;
    }
    public int search(int num, int[] temp){
        int lo = 0;
        int hi = temp.length - 1;
        while(lo <= hi){
            int mid = lo + (hi - lo) / 2;
            if(temp[mid] <= num){
                lo = mid + 1;
            }else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    public static void main(String[] args) {
        //System.out.println(search(4,new int[]{1,1,2,2,3,3,4,4,5,5,6,6}));
    }
}
