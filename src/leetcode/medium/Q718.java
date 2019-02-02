package leetcode.medium;

/**
 * Created by user on 2017/12/17.
 */
public class Q718 {
    public int findLength(int[] A, int[] B) {
        int n = A.length;
        int m = B.length;
        int[][] count = new int[n][m];
        int result = 0;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(i == 0||j == 0){
                    if(A[i] == B[j])
                        count[i][j] = 1;
                }else{
                    if(A[i] == B[j])
                        count[i][j] = count[i-1][j-1]+1;
                }
                result = Math.max(count[i][j],result);
            }
        }
        return result;
    }
}
