package leetcode.medium;

import java.util.Arrays;

/**
 * Created by user on 2018/8/16.
 */
public class Q807 {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[] maxrow = new int[n];
        int[] maxcol = new int[m];
        for(int i = 0;i < n;i ++){
            for (int j = 0;j < m;j++){
                maxcol[j] = Math.max(maxcol[j],grid[i][j]);
                maxrow[i] = Math.max(maxrow[i],grid[i][j]);
            }
        }
        int res = 0;
        for(int i = 0;i < n;i ++){
            for (int j = 0;j < m;j++){
                res += Math.min(maxcol[j],maxrow[i]) - grid[i][j];
            }
        }
        return res;
    }
}
