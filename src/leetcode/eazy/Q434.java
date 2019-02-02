package leetcode.eazy;

/**
 * Created by user on 2018/4/15.
 */
public class Q434 {
    public int countSegments(String s) {
        if(s == null)
            return 0;
        s = s.trim();
        if(s.equals(""))
            return 0;
        int res = 1;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == ' '){
                while(s.charAt(i) != ' ')
                    i++;
                res++;
            }
        }
        return res;
    }
}
