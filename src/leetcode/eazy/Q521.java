package leetcode.eazy;

/**
 * Created by user on 2018/4/11.
 */
public class Q521 {
    public int findLUSlength(String a, String b) {
        //return a.equals(b)?-1:Math.max(a.length(),b.length());
        return a.length() == b.length()?(a.equals(b)?-1:a.length()):(a.length()>b.length()?a.length():b.length());
    }
}
