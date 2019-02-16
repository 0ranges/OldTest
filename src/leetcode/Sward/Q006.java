package leetcode.Sward;

/**
 * @author : oranges
 * @title : leetcode.Sward
 * @date : 2019/2/16 13:25
 * @description :
 * 求斐波那契数列的第 n 项，n <= 39。
 */
public class Q006 {
    public int Fibonacci01(int n) {
        if(n <= 1){
            return n;
        }
        int[] res = new int[n+1];
        res[1] = 1;
        for(int i = 2;i <= n;i++){
            res[i] = res[i-1] + res[i-2];
        }
        return res[n];
    }
    public int Fibonacci02(int n) {
        if (n <= 1) {
            return n;
        }
        int pre2 = 0, pre1 = 1;
        int fib = 0;
        for (int i = 2; i <= n; i++) {
            fib = pre2 + pre1;
            pre2 = pre1;
            pre1 = fib;
        }
        return fib;
    }
}
