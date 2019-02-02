package leetcode.eazy;

/**
 * Created by user on 2018/4/17.
 */
public class Q441 {
    public int arrangeCoins(int n) {
        int i = 0;
        while(n>i) {
            n -= i;
            i++;
        }
        return n==i?i:i-1;
    }
}
