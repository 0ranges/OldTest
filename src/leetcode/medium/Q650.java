package leetcode.medium;

import java.util.Arrays;

/**
 * Created by user on 2018/7/26.
 */
public class Q650 {
    public int minSteps(int n) {
        int[] res = new int[n+1];
        res[1] = 0;
        for(int i = 2;i<=n;i++){
            for(int j = i/2;j>=1;j--){
                if(i % j == 0){
                    res[i] = res[j] + i/j;
                    break;
                }
            }
        }
        return res[n];
    }
}
