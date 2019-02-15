package leetcode.Sward;

/**
 * @author : oranges
 * @title : leetcode.Sward
 * @date : 2019/2/15 23:07
 * @description :
 * 给定一个二维数组，其每一行从左到右递增排序，从上到下也是递增排序。给定一个数，判断这个数是否在该二维数组中。
 * Consider the following matrix:
 * [
 * [1,   4,  7, 11, 15],
 * [2,   5,  8, 12, 19],
 * [3,   6,  9, 16, 22],
 * [10, 13, 14, 17, 24],
 * [18, 21, 23, 26, 30]
 * ]
 * Given target = 5, return true.
 * Given target = 20, return false.
 */
public class Q002 {
    public boolean Find(int target, int[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return false;
        }
        int n = matrix.length;
        int m = matrix[0].length;
        int row = 0;
        int col = m - 1;
        while (row < n && col >= 0){
            if(target > matrix[row][col]){
                row ++;
            }else if(target < matrix[row][col]){
                col --;
            }else{
                return true;
            }
        }
        return false;
    }
}
