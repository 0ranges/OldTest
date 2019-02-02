package leetcode.medium;

import java.util.Arrays;

/**
 * Created by user on 2018/3/30.
 */
public class Q378 {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[] nums = new int[n*m];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++)
                nums[i*m+j] = matrix[i][j];
        }
        Arrays.sort(nums);
        return nums[k-1];
    }
}
