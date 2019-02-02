package leetcode.medium;

/**
 * Created by user on 2018/8/7.
 */
public class Q474 {
    public static void main(String[] args) {
        System.out.println(findMaxForm(new String[]{"10","0001","111001","1","0"},5,3));
    }
    public static int findMaxForm(String[] strs, int m, int n) {
        int len = strs.length;
        int[][] nums = new int[len][2];
        for(int i = 0;i < len;i++){
            int zeros = 0;
            int ones = 0;
            for(int j = 0;j < strs[i].length();j++){
                if(strs[i].charAt(j) == '0')
                    zeros ++;
                else
                    ones ++;
            }
            nums[i][0] = zeros;
            nums[i][1] = ones;
        }
        int[][][] res = new int[len+1][m+1][n+1];
        for(int i = 1;i <= len;i++){
            for(int j = 0;j <= m;j++){
                for(int k = 0;k <= n;k++){
                    res[i][j][k] = res[i-1][j][k];
                    if(j >= nums[i-1][0] && k >= nums[i-1][1])
                        res[i][j][k] = Math.max(res[i][j][k],res[i-1][j-nums[i-1][0]][k-nums[i-1][1]]+1);
                }
            }
        }
        return res[len][m][n];
    }
}
