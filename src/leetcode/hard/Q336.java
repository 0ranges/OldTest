package leetcode.hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by user on 2017/9/19.
 */
public class Q336 {
    public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> list = new ArrayList<>();
        int n = words.length;
        if(n<2)
            return list;
        Map<String,Integer> all = new HashMap<>();
        for(int i = 0;i<n;i++){
            all.put(words[i],i);
        }
        for(int i = 0;i<n;i++){
            int k = words[i].length();
            for(int j = 0;j<k;j++){
                String str1 = words[i].substring(0,j);
                String str2 = words[i].substring(j);
                if(isValid(str1)){
                    String str = new StringBuilder(str2).reverse().toString();
                    if(all.containsKey(str)&&all.get(str)!=i){
                        List<Integer> intList = new ArrayList<>();
                        intList.add(all.get(str));
                        intList.add(i);
                        list.add(intList);
                    }
                }
                if(isValid(str2)){
                    String str = new StringBuilder(str1).reverse().toString();
                    if(all.containsKey(str)&&all.get(str)!=i&&str2.length()!=0){
                        List<Integer> intList = new ArrayList<>();
                        intList.add(i);
                        intList.add(all.get(str));
                        list.add(intList);
                    }
                }
            }
        }
        return list;
    }
    public boolean isValid(String str){
        int n = str.length();
        for(int i = 0;i<(n+1)/2;i++){
            if(str.charAt(i) != str.charAt(n-1-i))
                return false;
        }
        return true;
    }
}
