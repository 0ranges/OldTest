package leetcode.medium;

/**
 * Created by user on 2018/4/17.
 */
public class Q096 {
    public int numTrees(int n) {
        int[] arr = new int[n+1];
        arr[0] = 1;
        for(int i = 1;i<=n;i++){
            for(int j = 0;j<i;j++)
                arr[i] += arr[j]*arr[i-1-j];
        }
        return arr[n];
    }
}
