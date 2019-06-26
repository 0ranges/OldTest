package leetcode.medium;

public class Q962 {
    //超时
    public int maxWidthRamp(int[] A) {
        int res = A.length - 1;
        while(res > 0) {
            for(int i = 0;i + res < A.length;i ++) {
                if(A[i] <= A[i + res]){
                    return res;
                }
            }
            res --;
        }
        return 0;
    }

    public static void main(String[] args) {
        maxWidthRamp01(new int[]{9,8,1,0,1,9,4,0,4,1});
    }
    //
    public static int maxWidthRamp01(int[] A) {
        int n = A.length;
        int[] lo = new int[n];
        int[] hi = new int[n];
        lo[0] = 0;
        for(int i = 1;i < n;i ++) {
            if(A[i] < A[lo[i - 1]]){
                lo[i] = i;
            } else {
                lo[i] = lo[i - 1];
            }
        }
        hi[n - 1] = n - 1;
        for(int i = n - 2;i >= 0;i -- ){
            if(A[i] > A[hi[i + 1]]){
                hi[i] = i;
            } else {
                hi[i] = hi[i + 1];
            }
        }
        int res = 0;
        for(int i = 0;i < n;i ++){
            if(A[lo[i]] <= A[hi[i]]) {
                res = Math.max(res, hi[i] - lo[i]);
            }
        }
        return res;
    }
}
