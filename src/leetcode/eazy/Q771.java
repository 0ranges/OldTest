package leetcode.eazy;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by user on 2018/3/30.
 */
public class Q771 {
    public static void main(String[] args) {
        System.out.println(numJewelsInStones("bcd","cba"));
    }
    public static int numJewelsInStones(String J, String S) {
        int res = 0;
        HashSet<Character> set = new HashSet<>();
        for(int i = 0;i<J.length();i++)
            set.add(J.charAt(i));
        for(int i = 0;i<S.length();i++)
            if(set.contains(S.charAt(i)))
                res++;
        return res;
    }
}
