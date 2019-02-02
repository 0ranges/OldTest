package leetcode.medium;

/**
 * Created by user on 2017/8/19.
 *
 *

 Search a 2D Matrix

 Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

 Integers in each row are sorted from left to right.
 The first integer of each row is greater than the last integer of the previous row.
 For example,

 Consider the following matrix:

 [
 [1,   3,  5,  7],
 [10, 11, 16, 20],
 [23, 30, 34, 50]
 ]
 Given target = 3, return true.
 */
public class Q074 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0)
            return false;
        else {
            int x = matrix.length;
            int y = matrix[0].length;
            int row = 0;
            int low = y - 1;
            while (row < x && low >= 0) {
                if (matrix[row][low] == target)
                    return true;
                else if (matrix[row][low] < target) {
                    row++;
                } else if (matrix[row][low] > target)
                    low--;
            }
            return false;
        }
    }
}
