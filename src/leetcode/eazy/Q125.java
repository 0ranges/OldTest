package leetcode.eazy;

/**
 * Created by user on 2018/8/7.
 */
public class Q125 {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int lo = 0;
        int hi = s.length()-1;
        while(lo<hi){
            while(!(s.charAt(lo)>='a'&&s.charAt(lo)<='z'))
                lo++;
            while(!(s.charAt(hi)>='a'&&s.charAt(hi)<='z'))
                hi--;
            if(s.charAt(lo) != s.charAt(hi))
                return false;
            else{
                lo++;
                hi--;
            }
        }
        return true;
    }
}
