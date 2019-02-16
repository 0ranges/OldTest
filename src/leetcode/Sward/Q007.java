package leetcode.Sward;

import java.util.Arrays;

/**
 * @author : oranges
 * @title : leetcode.Sward
 * @date : 2019/2/16 13:31
 * @description :
 * 一只青蛙一次可以跳上 1 级台阶，也可以跳上 2 级...
 * 它也可以跳上 n 级。求该青蛙跳上一个 n 级的台阶总共
 * 有多少种跳法。
 */
public class Q007 {
    //动态规划
    public int JumpFloorII(int target) {
        int[] res = new int[target];
        Arrays.fill(res,1);
        for(int i = 1;i < target;i++){
            for(int j = 0;j < i;j++){
                res[i] += res[j];
            }
        }
        return res[target-1];
    }
}
