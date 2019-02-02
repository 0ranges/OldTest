package leetcode.hard;

/**
 * Created by user on 2018/3/10.
 */
public class Q010 {
    public static void main(String[] args) {
        System.out.println(isMatch("aa","a*"));
    }
    public static boolean isMatch(String s, String p) {
        char[] p_c = p.toCharArray();
        char[] s_c = s.toCharArray();
        int p_index = 0;
        int s_index = 0;
        while(p_index<p_c.length){
            if(p_c[p_index]!='*') {
                if (p_index+1<p_c.length&&p_c[p_index + 1] == '*'){
                    while(s_index<s_c.length&&(p_c[p_index] == s_c[s_index]||p_c[p_index] == '.'))
                        s_index++;
                    p_index++;
                }else{
                    if(s_index<s_c.length&&(p_c[p_index] == s_c[s_index]||p_c[p_index] == '.')){
                        p_index++;
                        s_index++;
                    }
                    else
                        return false;
                }
            }else
                p_index++;
        }
        if(s_index!=s_c.length)
            return false;
        return true;
    }
    public static boolean isMatch01(String s, String p) {
        if (p.length() == 0)
            return s.length() == 0;
        else if (p.length() == 1)
            return s.length() == 1&& (p.charAt(0) == '.' || s.charAt(0) == p.charAt(0));
        if (p.charAt(1) != '*') {
            if (s.length() == 0|| (p.charAt(0) != '.' && s.charAt(0) != p.charAt(0)))
                return false;
            return isMatch01(s.substring(1), p.substring(1));
        }
        else if (isMatch01(s, p.substring(2)))
            return true;
        else {
            int i = 0;
            while (i < s.length()&& (p.charAt(0) == '.' || p.charAt(0) == s.charAt(i))) {
                if (isMatch01(s.substring(i + 1), p.substring(2)))
                    return true;
                i++;
            }
        }
        return false;
    }

}
