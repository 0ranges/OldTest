package leetcode.medium;

/**
 * Created by user on 2018/8/7.
 */
public class Q091 {
    public static void main(String[] args) {
        System.out.println(numDecodings("226"));
    }
    public static int numDecodings(String s) {
        char[] chars = s.toCharArray();
        int[] res = new int[s.length()+1];
        if(chars[0] == '0')
            return 0;
        res[0] = 1;
        res[1] = 1;
        for(int i = 2; i<=s.length();i++) {
            int num = (chars[i - 2] - '0') * 10 + chars[i - 1] - '0';
            if (num >= 10 && num <= 26)
                res[i] += res[i - 2];
            else if(chars[i - 1] == '0')
                return 0;
            if (chars[i - 1] != '0')
                res[i] += res[i - 1];
        }
        return res[s.length()];
    }
}
