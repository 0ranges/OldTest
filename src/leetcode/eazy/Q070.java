package leetcode.eazy;

/**
 * Created by user on 2018/8/7.
 */
public class Q070 {
    public int climbStairs(int n) {
        int a = 1;
        int b = 2;
        if(n == 1)
            return a;
        if(n == 2)
            return b;
        for(int i = 2;i < n;i++){
            int temp = b;
            b += a;
            a = temp;
        }
        return b;
    }
}
