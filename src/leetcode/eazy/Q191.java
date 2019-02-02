package leetcode.eazy;

/**
 * Created by user on 2018/4/23.
 */
public class Q191 {
    public static int hammingWeight(int n) {
        int res = 0;
        while(n!=0){
            res += n&1;
            n = n >>> 1;
        }
        return res;
    }
}
