package leetcode.medium;

/**
 * Created by user on 2018/3/17.
 */
public class Q014 {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null||strs.length == 0)
            return "";
        int min = Integer.MAX_VALUE;
        for(String str:strs)
            min = str.length()<min?str.length():min;
        String result = "";
        for(int i = 0;i<min;i++){
            char c = strs[0].charAt(i);
            for(String str:strs)
                if(str.charAt(i)!=c)
                    return result;
            result += c;
        }
        return result;
    }
}
