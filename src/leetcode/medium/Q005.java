package leetcode.medium;

/**
 * Created by user on 2018/3/2.
 */
public class Q005 {
    public String longestPalindrome(String s) {
        if(s == null||s.length() == 0)
            return "";
        int n = s.length();
        char[] ch = s.toCharArray();
        char[] ch_re = new char[n];
        for(int i = 0;i<n;i++)
            ch_re[i] = ch[n-1-i];
        int[][] str = new int[n+1][n+1];
        for(int i = 1;i<=n;i++){
           for(int j = 1;j<=n;j++)
               str[i][j] = ch[i-1] == ch_re[j-1]?str[i-1][j-1]+1:0;
        }
        String result = "";
        int max = 0;
        for(int i = 1;i<=n;i++) {
            for (int j = 1; j <= n; j++)
                if (max > str[i][j]) {
                    max = str[i][j];
                    result = s.substring(i-max,i-1);
                }
        }
        return result;
    }

    public String longestPalindrome01(String s) {
        if(s.length() < 2)
            return s;
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++)
                dp[i][j] = false;
        }
        int start = 0,len = 0;
        for(int i = 0;i<n;i++){
            dp[i][i] = true;
            for(int j = 0;j<i;j++) {
                dp[j][i] = (s.charAt(i) == s.charAt(j) && ((i - j) < 2 || dp[j + 1][i - 1]));
                if (dp[j][i] && len < i - j + 1) {
                    len = i - j + 1;
                    start = j;
                }
            }
        }
            return s.substring(start,start+len);
    }
}
