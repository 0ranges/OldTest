package leetcode.medium;

/**
 * Created by user on 2018/4/1.
 */
public class Q372 {
    public static void main(String[] args) {
        System.out.println(superPow(2,new int[]{3}));
    }
    public  static int superPow(int a, int[] b) {
        int n = b.length-1;
        a = a%1337;
        int res = 1;
        while(n>=0) {
            int m = 1;
            for (int i = 1; i <= b[n]; i++)
                m = m * a % 1337;
            res = res * m % 1337;
            for (int i = b[n] + 1; i <= 10; i++)
                m = m * a % 1337;
            a = m;
            n--;
        }
        return res;
    }
}
