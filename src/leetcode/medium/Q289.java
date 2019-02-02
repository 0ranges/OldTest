package leetcode.medium;

import java.util.Arrays;

/**
 * Created by user on 2018/8/16.
 */
public class Q289 {
    public void gameOfLife(int[][] board) {
        int n = board.length;
        int m = board[0].length;
        int[][] state = new int[n+2][m+2];
        for(int i = 1;i <= n;i++){
            for(int j = 1;j <= m;j++){
                state[i][j] = board[i-1][j-1];
            }
        }
        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                int count = count(i,j,state);
                if(count < 2 || count > 3)
                    board[i][j] = 0;
                else if(count == 3)
                    board[i][j] = 1;
            }
        }
    }
    public int count(int i,int j,int[][] state){
        int res = 0;
        for(int n = i;n <= i+2;n ++){
            for(int m = j;m <= j+2;m ++){
                res += state[n][m];
            }
        }
        return res-state[i+1][j+1];
    }
}
