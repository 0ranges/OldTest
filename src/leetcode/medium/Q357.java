package leetcode.medium;

/**
 * Created by user on 2018/8/3.
 */
public class Q357 {
    public int countNumbersWithUniqueDigits(int n) {
        if(n == 0)
            return 0;
        int[] res = new int[n+1];
        res[1] = 10;
        for(int i = 2; i<=n;i++){
            int num = 9;
            int res_ = 1;
            for(int j = 0;j<i-1&&num>=0;j++,num--){
                res_ *= num;
            }
            res[i] = res[i-1] + 9 * res_;
        }
        return res[n];
    }
}
