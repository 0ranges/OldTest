package leetcode.medium;

/**
 * Created by user on 2018/7/31.
 */
public class Q062 {
    public static void main(String[] args) {
        System.out.println(uniquePaths(10,10));
    }
    public static int uniquePaths(int m, int n) {
        int a = m + n - 2 ;
        int b = Math.min(m, n) - 1;
        long res_a = 1;
        long res_b = 1;
        for(int i = 1;i <= b;a--,i++){
            res_a *= a;
            res_b *= i;
            if(res_a % res_b == 0){
                res_a /= res_b;
                res_b = 1;
            }
        }
        return (int)res_a;
    }
}
