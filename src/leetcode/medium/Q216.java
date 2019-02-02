package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 2017/12/15.
 */
public class Q216 {
    public  List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        dfs(1,k,n,result,temp);
        return result;
    }
     void dfs(int start,int k,int n,List<List<Integer>> result,List<Integer> temp){
        if(k == 0&&n == 0){
            result.add(new ArrayList<>(temp));
        }else if(k>0&&n>0) {
            for (int i = start; i <= 9; i++) {
                temp.add(i);
                dfs(i + 1, k - 1, n - i, result, temp);
                temp.remove(temp.size() - 1);
            }
        }
    }
}
