package leetcode.hard;

import java.util.HashMap;

/**
 * Created by user on 2018/7/26.
 */
public class Q828 {
    public static void main(String[] args) {
        System.out.println(uniqueLetterString("ABA"));
    }
    public static int uniqueLetterString(String S) {
        HashMap<Character,Integer> map = new HashMap<>();
        int result = S.length();
        for(int i = 2;i<=S.length();i++){
            int j = 0;
            int res = 0;
            for(;j<i;j++){
                char c = S.charAt(j);
                if(map.containsKey(c)){
                    map.put(c,map.get(c)+1);
                }else {
                    map.put(c,1);
                }
            }
            for(int k : map.values()){
                if(k == 1)
                    res ++;
            }
            result += res;
            for(;j<S.length();j++){
                char c = S.charAt(j);
                if(map.containsKey(c)){
                    if(map.get(c) == 1)
                        res --;
                    map.put(c,map.get(c)+1);
                }else {
                    map.put(c,1);
                    res++;
                }
                c = S.charAt(j-i);
                if(map.get(c) == 1){
                    map.remove(c);
                    res--;
                }else{
                    map.put(c,map.get(c) - 1 );
                    if(map.get(c) == 1)
                        res ++;
                }
                result += res;
            }
            map.clear();
        }
        return result;
    }
}
