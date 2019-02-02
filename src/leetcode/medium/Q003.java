package leetcode.medium;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by user on 2018/3/1.
 */
public class Q003 {
    public int lengthOfLongestSubstring(String s) {
        if(s == null||s.length() == 0)
            return 0;
        char[] ch = s.toCharArray();
        int n = s.length();
        int max = 0;
        HashSet<Character> set = new HashSet<>();
        int index = 0;
        for(int i = 0;i<n;i++){
            max = Math.max(max,set.size());
            if(!set.add(ch[i])){
                for(int j = index;j<i;j++){
                    set.remove(ch[j]);
                    if(ch[i] == ch[j]) {
                        index = j+1;
                        break;
                    }
                }
                set.add(ch[i]);
            }
        }
        return max;
    }
    //true
    public int lengthOfLongestSubstring01(String s) {
        int len=s.length();
        if(len==0){
            return 0;
        }
        int i=0,j=0;
        int maxLen=1,Len=1;
        Set set=new HashSet<Character>();
        j++;
        set.add(s.charAt(i));
        while (j<len){
            if(!set.add(s.charAt(j))){
                while (s.charAt(i)!=s.charAt(j)){
                    set.remove(s.charAt(i));
                    i++;
                }
                if(i!=j){
                    i++;
                }
            }else{
                set.add(s.charAt(j));
            }
            Len=j-i+1;
            if(Len>maxLen){
                maxLen=Len;
            }
            j++;
        }
        return maxLen;
    }
}
