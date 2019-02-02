package JAVA.Collection;

import java.util.*;

/**
 * Created by user on 2017/4/22.
 */
public class HashMapDemo01 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("baidu","www.baidu.com");
        map.put("google","www.google.com");
        map.put("4399","www.4399.com");
        map.put("douyu","www.douyu.com");
        String str = map.get("douyu");
        System.out.println(str);
        System.out.println(map.containsKey("4399")?"key存在":"key不存在");
        System.out.println(map.containsValue("www.11.com")?"vale存在":"value不存在");
        Set<String> keySet = map.keySet();
        Iterator<String> iter = keySet.iterator();
        while (iter.hasNext()){
            System.out.printf("%s,",iter.next());
        }
        Collection<String> collection = map.values();
        Iterator<String> iter01 = collection.iterator();
        while (iter01.hasNext()){
            System.out.printf("%s,",iter01.next());
        }
    }
}
