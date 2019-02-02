package leetcode.medium;

/**
 * Created by user on 2017/12/30.
 */
public class Q712 {
    public int minimumDeleteSum(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        int[][] a = new int[n+1][m+1];
        for(int i = 0;i<=n;i++){
            for(int j = 0;j<=m;j++){
                if(j == 0&&i == 0)
                    a[i][j] = 0;
                else if(i == 0)
                    a[i][j] = s2.charAt(j-1)+a[i][j-1];
                else if(j == 0)
                    a[i][j] = s1.charAt(i-1)+a[i-1][j];
                else{
                    int cost = 0;
                    if(s1.charAt(i-1) != s2.charAt(j-1))
                        cost = s1.charAt(i-1)+s2.charAt(j-1);
                    a[i][j] = Math.min(a[i-1][j]+s1.charAt(i-1),a[i][j-1]+s2.charAt(j-1));
                    a[i][j] = Math.min(a[i-1][j-1]+cost,a[i][j]);
                }
            }
        }
        return a[n][m];
    }
}
