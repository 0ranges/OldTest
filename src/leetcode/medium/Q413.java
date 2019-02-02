package leetcode.medium;

/**
 * Created by user on 2018/8/6.
 */
public class Q413 {
    public int numberOfArithmeticSlices(int[] A) {
        for(int i = 0;i<A.length-1;i++){
            A[i] = A[i+1] - A[i];
        }
        int res = 0;
        int count = 1;
        for(int i = 1;i<A.length-1;i++){
            if(A[i] == A[i-1]) {
                count++;
                res += count > 1 ? count -1 : 0;
            }else
                count = 1;
        }
        return res;
    }
}
