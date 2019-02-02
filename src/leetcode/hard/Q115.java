package leetcode.hard;

import java.util.Arrays;

/**
 * Created by user on 2018/8/17.
 */
public class Q115 {
    public static void main(String[] args) {
        System.out.println(numDistinct("babgbag","bag"));
    }
    public static int numDistinct(String s, String t) {
        int n = t.length();
        int m = s.length();
        int[][] res = new int[n + 1][m + 1];
        Arrays.fill(res[0],1);
        for(int i = 1;i <= n;i++){
            for(int j = i;j <= m;j++){
                res[i][j] = res[i][j-1];
                if(s.charAt(j - 1) == t.charAt(i - 1)){
                    res[i][j] += res[i-1][j-1];
                }
            }
        }
        return res[n][m];
    }
}
