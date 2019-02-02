package leetcode.hard;

/**
 * Created by user on 2018/4/9.
 */
public class Q514 {
    public int findRotateSteps(String ring, String key) {
        int n = key.length();
        int m = ring.length();
        int[][] res = new int[n][m];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++)
                res[i][j] = Integer.MAX_VALUE;
        }
        for(int j = 0;j<m;j++)
            if(key.charAt(0) == ring.charAt(j))
                res[0][j] = Math.min(j,m-j)+1;
        for(int i = 1;i<n;i++){
            for(int j = 0;j<m;j++)
                if(key.charAt(i) == ring.charAt(j)){
                    for(int k = 0;k<m;k++)
                        if(res[i-1][k]!=Integer.MAX_VALUE) {
                            int a = Math.abs(k-j);
                            res[i][j] = Math.min(res[i-1][k]+Math.min(a,m-a)+1,res[i][j]);
                        }
                }
        }
        int result = Integer.MAX_VALUE;
        for(int j = 0;j<m;j++)
            result = Math.min(result,res[n-1][j]);
        return result;
    }
}
