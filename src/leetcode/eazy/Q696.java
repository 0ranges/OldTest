package leetcode.eazy;

/**
 * Created by user on 2018/7/23.
 */
public class Q696 {
    public int countBinarySubstrings(String s) {
        int countA = 1;
        int countB = 0;
        int result = 0;
        for(int i = 1;i<s.length();i++){
            if(s.charAt(i) == s.charAt(i-1))
                countA ++;
            else{
                result += Math.min(countA,countB);
                countB = countA;
                countA = 1;
            }
        }
        result += Math.min(countA,countB);
        return result;
    }
}
