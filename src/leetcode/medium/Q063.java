package leetcode.medium;

/**
 * Created by user on 2018/8/3.
 */
public class Q063 {
    public static void main(String[] args) {
        System.out.println(uniquePathsWithObstacles(new int[][]{{0,0,0},{0,1,0},{0,0,0}}));
    }
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;
        int[][] res = new int[n][m];
        for(int i = 0 ;i < n ;i++){
            for(int j = 0;j<m;j++){
                if(obstacleGrid[i][j] == 1) {
                    res[i][j] = 0;
                }else {
                    if(j == 0 && i == 0){
                        res[i][j] = 1;
                    }else if(j == 0){
                        res[i][j] = res[i-1][j];
                    }else if(i == 0){
                        res[i][j] = res[i][j-1];
                    }else{
                        res[i][j] = res[i-1][j] + res[i][j-1];
                    }
                }
            }
        }
        return res[n-1][m-1];
    }
}
