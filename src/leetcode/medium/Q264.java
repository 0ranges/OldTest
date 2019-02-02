package leetcode.medium;

/**
 * Created by user on 2018/7/30.
 */
public class Q264 {
    public static void main(String[] args) {
        System.out.println(nthUglyNumber(11));
    }
    public static int nthUglyNumber(int n) {
        int index_2 = 1;
        int index_3 = 1;
        int index_5 = 1;
        int res_2 = 2;
        int res_3 = 3;
        int res_5 = 5;
        int[] res = new int[n+1];
        res[1] = 1;
        for(int i = 2;i<=n;i++){
            res[i] = Math.min(Math.min(res_2,res_3),res_5);
            if(res_2 == res[i])
                res_2 = res[++index_2] * 2;
            if(res_3 == res[i])
                res_3 = res[++index_3] * 3;
            if(res_5 == res[i])
                res_5 = res[++index_5] * 5;
         }
        return res[n];
    }
}
