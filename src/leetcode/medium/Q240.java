package leetcode.medium;

/**
 * Created by user on 2017/12/19.
 */
public class Q240 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0||matrix[0].length==0)
            return false;
        int m = matrix.length;
        int j = matrix[0].length-1;
        int i = 0;
        while (i<m && j>=0) {
            if (matrix[i][j]==target) return true;
            else if (matrix[i][j]<target) i++;
            else j--;
        }
        return false;
    }
}
