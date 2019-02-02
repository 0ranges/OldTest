package leetcode.medium;

/**
 * Created by user on 2018/3/4.
 */
public class Q006 {
    public String convert(String s, int numRows) {
        if(s.length() == 0)
            return "";
        if(numRows == 1)
            return s;
        int index = 2*(numRows-1);
        int n = (s.length()-1)/index+1;
        String result = "";
        for(int i = 0;i<n;i++)
            result += s.charAt(i*index);
        for(int i = 1;i<numRows-1;i++) {
            for (int j = 0; j < n; j++) {
                if (i + j * index < s.length())
                    result += s.charAt(i + j * index);
                if (i + j * index + (numRows - i-1) * 2 < s.length())
                    result += s.charAt(i + j * index + (numRows- i-1) * 2);
            }
        }
        for(int i = 0;i<n;i++) {
            if (i * index + numRows - 1 < s.length()) {
                result += s.charAt(i * index + numRows - 1);
            }
        }
        return result;
    }
}
