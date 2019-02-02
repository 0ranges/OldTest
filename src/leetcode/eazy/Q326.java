package leetcode.eazy;

/**
 * Created by user on 2018/7/23.
 */
public class Q326 {
    public boolean isPowerOfThree(int n) {
        while( n > 2 && n % 3 == 0){
            n /= 3;
        }
        return n == 1;
    }
}
