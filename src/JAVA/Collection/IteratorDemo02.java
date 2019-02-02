package JAVA.Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by user on 2017/4/23.
 */
public class IteratorDemo02 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("baidu","www.baidu.com");
        map.put("google","www.google.com");
        map.put("4399","www.4399.com");
        map.put("douyu","www.douyu.com");
        Set<Map.Entry<String,String>> set = map.entrySet();
        Iterator<Map.Entry<String,String>> iter = set.iterator();
        while (iter.hasNext()) {
            Map.Entry<String,String> entry = iter.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
