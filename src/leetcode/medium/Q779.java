package leetcode.medium;

/**
 * Created by user on 2018/8/6.
 */
public class Q779 {
    public int kthGrammar(int N, int K) {
        int res = 0;
        while(K > 1){
            if(K % 2 == 0) {
                res++;
                K /= 2;
            }else{
                K = (K+1)/2;
            }
        }
        return res %     2 == 0 ? 0 : 1;
    }
}
