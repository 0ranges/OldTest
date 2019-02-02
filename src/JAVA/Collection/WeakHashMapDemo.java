package JAVA.Collection;

import java.util.Map;
import java.util.WeakHashMap;

/**
 * Created by user on 2017/4/22.
 */
public class WeakHashMapDemo {
    public static void main(String[] args) {
        Map<String,String> map = new WeakHashMap<>();
        map.put(new String("a"),new String("b"));
        map.put(new String("b"),new String("b"));
        map.put(new String("c"),new String("b"));
        map.put(new String("d"),new String("b"));
        map.put(new String("e"),new String("b"));
        System.out.println(map);
        System.gc();
        System.out.println(map);
    }
}
