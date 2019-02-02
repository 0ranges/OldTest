package leetcode.eazy;

/**
 * Created by user on 2018/4/16.
 */
//位运算
public class Q471 {
    public int getSum(int a, int b) {
        if(b == 0) return a;        // when carry is zero, return
        int sum = a ^ b;        // calculate sum without carry
        int carry = (a & b) << 1;       // calculate carry
        return getSum(sum, carry);
    }
}
