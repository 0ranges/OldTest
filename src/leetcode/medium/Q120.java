package leetcode.medium;

import java.util.List;

/**
 * Created by user on 2018/8/7.
 */
public class Q120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[] res = new int[n];
        res[0] = triangle.get(0).get(0);
        for(int i = 1;i<n;i++){
            res[i] = res[i-1] +  triangle.get(i).get(i);
            for(int j = i-1 ;j > 0;j--){
                res[j] = Math.min(res[j],res[j-1]) + triangle.get(i).get(j);
            }
            res[0] += triangle.get(i).get(0);
        }
        int result = res[0];
        for(int i : res)
            result = Math.min(result,i);
        return result;
    }
}
