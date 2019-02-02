package leetcode.medium;

import java.util.*;

/**
 * @author : oranges
 * @date : 2018/9/6 16:49
 */
public class Q756 {
    public static void main(String[] args) {
//        String bottom = "DBCBBC";
//        String[] strs = new String[]{"AAD","ACB","AAA","AAC","AAB","BCD","BCA","BCC","BAB","BAC","BAA","CAC","CAB","CAA","CCC","DAD","BDD","CCD","DAA","DAC","ACD","DCC","ACC","ABA","ABB","ABC","ABD","BDC","BDB","BBD","BBC","BBB","ADD","ADB","ADC","ADA","DDC","DDA","CBB","CBC","CBA","CDA","CBD","CDC","DBA","DBC"};
//        List<String> list = new ArrayList<>();
        String bottom = "XXXXXX";
        String[] strs = new String[]{"XXX", "XXY", "YYY"};
        List<String> list = new ArrayList<>();
        for(String str : strs){
            list.add(str);
        }
        System.out.println(pyramidTransition(bottom,list));
    }
    public static boolean pyramidTransition(String bottom, List<String> allowed) {
        Map<String,List<String>> map =new HashMap<>();
        for(String str : allowed){
            String a = str.substring(0,2);
            if(map.containsKey(a)){
                map.get(a).add(str.substring(2,3));
            }else{
                List<String> list = new ArrayList<>();
                list.add(str.substring(2,3));
                map.put(a,list);
            }
        }
        Set<String> set = new HashSet<>();
        Set<String> temp = new HashSet<>();
        set.add(bottom);
        int n = bottom.length();
        for(int i = n-1;i > 1;i--){
            for(String l_ : set){
                add(l_,map,temp);
            }
            if(temp.size() == 0){
                return false;
            }else{
                set = temp;
                for(String L_ : set) {
                    System.out.println(L_);
                }
                temp = new HashSet<>();
            }
        }
        for(String L_ : set){
            if(map.containsKey(L_)){
                return true;
            }
        }
        return false;
    }
    public static void add(String str,Map<String,List<String>> map,Set<String> next){
        List<String> a = new ArrayList<>();
        List<String> b = new ArrayList<>();
        a.add("");
        int n = str.length();
        for(int i = 0;i < n-1;i++){
            String key = str.substring(i,i+2);
            if(!map.containsKey(key)) {
                return;
            } else{
                List<String> value = map.get(key);
                for(String a_ : a){
                    for(String value_ : value){
                        if(i > 0 && map.containsKey(a_.substring(i-1,i)+value_)){
                            b.add(a_ + value_);
                        }else if(i == 0){
                            b.add(value_);
                        }
                    }
                }
                a = b;
                b = new ArrayList<>();
            }
        }
        for(String a_ : a){
            next.add(a_);
        }
    }
}
