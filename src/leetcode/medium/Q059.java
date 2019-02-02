package leetcode.medium;

/**
 * Created by user on 2017/9/18.
 */
public class Q059 {
    public static int[][] generateMatrix(int n) {
        int num[][] = new int[n][n];
        int x = 0;
        int y = 0;
        int index = 1;
        for(int i = 1;i<=n/2;i++){
            for(int j = 0;j<n+1-i*2;j++){
                num[x][y] = index;
                index++;
                y++;
            }
            for(int j = 0;j<n+1-i*2;j++){
                num[x][y] = index;
                index++;
                x++;
            }
            for(int j = 0;j<n+1-i*2;j++){
                num[x][y] = index;
                index++;
                y--;
            }
            for(int j = 0;j<n+1-i*2;j++){
                num[x][y] = index;
                index++;
                x--;
            }
            x++;
            y++;
        }
        if(n%2 == 1)
            num[n/2][n/2] = n*n;
        return num;
    }

    public static void main(String[] args) {
        int a[][] = generateMatrix(4);
    }
}
