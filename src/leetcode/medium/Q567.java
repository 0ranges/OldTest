package leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by user on 2017/9/14.
 */
public class Q567 {
    public static boolean checkInclusion(String s1, String s2) {
        int num1[] = new int[26];
        int len1 = s1.length();
        int len2 = s2.length();
        for(int i = 0;i<len1;i++)
            num1[s1.charAt(i)-'a']++;
        int num2[] = new int[26];
        for(int i = 0;i<len2;i++){
            num2[s2.charAt(i)-'a']++;
            if(i>=len1)
                num2[s2.charAt(i-len1)-'a']--;
            if(Arrays.equals(num1,num2))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";
        System.out.println(checkInclusion(s1,s2));
    }
}
