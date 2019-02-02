package leetcode.medium;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
/**
 * Created by user on 2018/8/10.
 */
public class Q395 {
    public static void main(String[] args) {
        System.out.println(longestSubstring("weitong",2));
    }
    //public static int max = 0;
    public static int longestSubstring(String s, int k) {
        return search(s,k,0,s.length()-1);
    }
    public static int search(String s,int k,int lo,int hi){
       int[] count = new int[26];
       for(int i = lo;i <= hi;i++){
           count[s.charAt(i)-'a']++;
       }
       for(int i = 0;i<26;i++){
           if(count[i] < k && count[i] > 0){
               int mid = s.indexOf((char)i+'a',lo);
               return Math.max(search(s,k,lo,mid-1),search(s,k,mid+1,hi));
           }
       }
       return hi-lo+1;
    }
}
