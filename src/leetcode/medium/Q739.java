package leetcode.medium;

/**
 * @author : oranges
 * @date : 2018/9/13 17:53
 */
public class Q739 {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n];
        res[n-1] = 0;
        for(int i = n-2;i >= 0;i--){
            int j = i+1;
            for(;j<n;j++){
                if(temperatures[i] < temperatures[j]){
                    res[i] = res[j] + j - i;
                    break;
                }
            }
            if(j == n){
                res[i] = 0;
            }
        }
        return res;
    }
//    int[] rst = new int[temperatures.length];
//    rst[temperatures.length - 1] = 0;
//        for (int i = temperatures.length - 2; i >= 0; i--) {
//        int j = i + 1;
//        while (temperatures[j] <= temperatures[i] && rst[j] > 0) j = j + rst[j];
//        if (temperatures[j] <= temperatures[i]) rst[i] = 0;
//        else rst[i] = j - i;
//    }
//        return rst;
}
