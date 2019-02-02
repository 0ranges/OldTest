package JAVA.Collection;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by user on 2017/4/22.
 */
public class TreeMapDemo {
    public static void main(String[] args) {
        Map<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(100,"a");
        treeMap.put(20,"b");
        treeMap.put(10,"c");
        treeMap.put(10,"d");
        treeMap.put(4,"e");
        treeMap.put(24,"f");
        treeMap.put(24,"g");
        treeMap.put(13,"h");
        Set<Integer> set = treeMap.keySet();
        Iterator<Integer> iter = set.iterator();
        while (iter.hasNext()){
            System.out.printf("%d,",iter.next());
        }
    }
}
