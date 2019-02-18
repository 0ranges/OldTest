package leetcode.Sward;

/**
 * @author : oranges
 * @title : leetcode.Sward
 * @date : 2019/2/18 14:59
 * @description :
 * 请实现一个函数用来匹配包括 '.' 和 '*' 的正则表达式。模式中的
 * 字符 '.' 表示任意一个字符，而 '*' 表示它前面的字符可以出现任
 * 意次（包含 0 次）。
 *
 * 在本题中，匹配是指字符串的所有字符匹配整个模式。例如，字符串
 * "aaa" 与模式 "a.a" 和 "ab*ac*a" 匹配，但是与 "aa.a" 和 "ab*a"
 * 均不匹配。
 */
public class Q017 {
    public boolean match(char[] str, char[] pattern) {
        int n = str.length;
        int m = pattern.length;
        boolean[][] dp = new boolean[n + 1][m + 1];
        dp[0][0] = true;
        for(int i = 1;i <= m;i++){
            if(pattern[i - 1] == '*'){
                dp[0][i] = dp[0][i - 2];
            }
        }
        for(int i = 1;i <= n;i++){
            for(int j = 1;j <= m;j++){
                if(str[i - 1] == pattern[j - 1] || pattern[j - 1] == '.'){
                    dp[i][j] = dp[i - 1][j - 1];
                }else if (pattern[j - 1] == '*'){
                    if (pattern[j - 2] == str[i - 1] || pattern[j - 2] == '.') {
                        // a* counts as single a
                        dp[i][j] |= dp[i][j - 1];
                        // a* counts as multiple a
                        dp[i][j] |= dp[i - 1][j];
                        // a* counts as empty
                        dp[i][j] |= dp[i][j - 2];
                    }else{
                        dp[i][j] = dp[i][j - 2];
                    }
                }
            }
        }
        return dp[n][m];
    }
}
