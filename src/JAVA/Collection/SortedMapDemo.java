package JAVA.Collection;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * Created by user on 2017/4/23.
 */
public class SortedMapDemo {
    public static void main(String[] args) {
        SortedMap<String,String> map = new TreeMap<>();
        map.put("B","www.baidu.com");
        map.put("C","www.google.com");
        map.put("A","www.4399.com");
        map.put("D","www.douyu.com");
        map.put("H","www.baidu.com");
        map.put("F","www.google.com");
        map.put("Y","www.4399.com");
        map.put("E","www.douyu.com");
        System.out.printf("%s %s\n",map.firstKey(),map.get(map.firstKey()));
        System.out.printf("%s %s\n",map.lastKey(),map.get(map.lastKey()));
        for(Map.Entry<String,String> entry:map.entrySet()){
            System.out.printf("%s %s\n",entry.getKey(),entry.getValue());
        }
        System.out.println();
        for(Map.Entry<String,String> entry:map.subMap("D","F").entrySet()){
            System.out.printf("%s %s\n",entry.getKey(),entry.getValue());
        }
        System.out.println();
        for(Map.Entry<String,String> entry:map.tailMap("E").entrySet()){
            System.out.printf("%s %s\n",entry.getKey(),entry.getValue());
        }
    }
}
