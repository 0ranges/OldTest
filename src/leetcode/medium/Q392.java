package leetcode.medium;

/**
 * Created by user on 2018/8/7.
 */
public class Q392 {
    public boolean isSubsequence(String s, String t) {
        int len1 = s.length();
        int len2 = t.length();
        if(len1 == 0)
            return true;
        int i = 0;
        int j = 0;

        while (j < len2){
            if(t.charAt(j) == s.charAt(i))
                i++;
            if(i == len1)
                return true;
            j++;
        }
        return false;
    }
}
