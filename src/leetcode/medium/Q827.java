package leetcode.medium;

import java.util.Arrays;

/**
 * Created by user on 2018/8/16.
 */
public class Q827 {
    public static void main(String[] args) {
        System.out.println(new21Game(21,17,10));
    }
    public static double new21Game(int N, int K, int W) {
        if(K - 1 + W <= N)
            return 1.0;
        int n = K - 1 + W;
        double[] fore = new double[n + 1];
        fore[0] = 1.0;
        double total = 0.0;
        for(int i = 1;i <= n;i++){
            if(i <= K){
                total += fore[i - 1];
            }
            if(i - W > 0){
                total -= fore[i - W - 1];
            }
            fore[i] = total / W;
        }
        double res = 0.0;
        for(int i = K ; i <= N ; i++ ){
            res += fore[i];
        }
        return res;
    }
}
