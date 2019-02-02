package leetcode.medium;

/**
 * Created by user on 2018/8/7.
 */
public class Q064 {
    public int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(j == 0 && i > 0)
                    grid[i][j] += grid[i-1][j];
                else if(i == 0 && j > 0)
                    grid[i][j] += grid[i][j-1];
                else if(i == 0 && j == 0)
                    continue;
                else{
                    grid[i][j] += Math.min(grid[i-1][j],grid[i][j-1]);
                }
            }
        }
        return grid[n-1][m-1];
    }
}
