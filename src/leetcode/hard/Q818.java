package leetcode.hard;

import java.util.Map;

/**
 * @author : oranges
 * @date : 2018/9/20 16:22
 */
public class Q818 {
    private int[] res = new int[10001];
    public int racecar(int target) {
        if(res[target] > 0){
            return res[target];
        }
        int n = (int)(Math.log(target)/Math.log(2)) + 1;
        if(Math.pow(2,n) == target + 1){
            res[target] = n;
        }else{
            res[target] = racecar((int)Math.pow(2,n) - 1 - target) + n + 1;
            for(int m = 0; m < n - 1;m++){
                res[target] = Math.min(res[target] , racecar(target  - (int)Math.pow(2,n-1) + (int)Math.pow(2,m)) + n + m + 1 );
            }
        }
        return res[target];
    }
}
