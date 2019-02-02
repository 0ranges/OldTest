package leetcode.medium;

/**
 * Created by user on 2017/9/22.
 */
public class Q498 {
    public static int[] findDiagonalOrder(int[][] matrix) {
        int n = matrix.length;
        if(n == 0)
            return null;
        int m = matrix[0].length;
        int result[] = new int[n*m];
        int left = 0;
        int right = 0;
        int index = 0;

        for(int i = 0;i<=result.length;i++){
            result[i] = matrix[left][right];
            if((left+right)%2==0){
                if(right == n-1)
                    left++;
                else if(left == 0)
                    right++;
                else{
                    left--;
                    right++;
                }
            }else{
                if(left == m-1)
                    right++;
                else if(right == 0)
                    left++;
                else{
                    left++;
                    right--;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int need[][] = {{1,2,3},{4,5,6},{7,8,8}};
        int a[] = findDiagonalOrder(need);
    }
}
