package leetcode.medium;

import java.util.HashSet;

/**
 * Created by user on 2017/9/19.
 */
public class Q036 {
    public boolean isValidSudoku(char[][] board) {
        for(int i =0;i<9;i++){
            HashSet<Character> rows = new HashSet<>();
            HashSet<Character> lows = new HashSet<>();
            HashSet<Character> columns = new HashSet<>();
            for(int j = 0;j<9;j++){
                if(board[i][j]!='.'&&!rows.add(board[i][j]))
                    return false;
                if(board[j][i]!='.'&&!lows.add(board[j][i]))
                    return false;
                int RowIndex = 3*(i/3);
                int ColIndex = 3*(i%3);
                if(board[RowIndex + j/3][ColIndex + j%3]!='.' && !columns.add(board[RowIndex + j/3][ColIndex + j%3]))
                    return false;
            }
        }
        return true;
    }
}
