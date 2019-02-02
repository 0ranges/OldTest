package leetcode.eazy;

/**
 * Created by user on 2018/3/30.
 */
public class Q661 {
    public int[][] imageSmoother(int[][] M) {
        int n = M.length;
        int m = M[0].length;
        int[][] res = new int[n][m];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                int all = 1;
                int sum = M[i][j];
                if(i-1>=0&&j-1>=0) {
                    all++;
                    sum += M[i-1][j-1];
                }if(i-1>=0) {
                    all++;
                    sum += M[i-1][j];
                }if(i-1>=0&&j+1<m) {
                    all++;
                    sum += M[i-1][j+1];
                }if(j-1>=0) {
                    all++;
                    sum += M[i][j-1];
                }if(j+1<m) {
                    all++;
                    sum += M[i][+1];
                }if(i+1<n&&j-1>=0) {
                    all++;
                    sum += M[i+1][j-1];
                }if(i+1<n) {
                    all++;
                    sum += M[i+1][j];
                }if(i+1<n&&j+1<m) {
                    all++;
                    sum += M[i+1][j+1];
                }
                res[i][j] = sum/all;
            }
        }
        return res;
    }
}
