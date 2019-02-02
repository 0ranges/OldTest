package leetcode.eazy;

/**
 * Created by user on 2018/4/17.
 */
public class Q461 {
    public int hammingDistance(int x, int y) {
        int res = 0;
        while(x>0||y>0) {
            if (x % 2 != y % 2)
                res++;
            x /= 2;
            y /= 2;
        }
        return res;
    }
}
