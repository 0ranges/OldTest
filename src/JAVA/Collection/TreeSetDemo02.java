package JAVA.Collection;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by user on 2017/4/22.
 */
public class TreeSetDemo02 {
    public static void main(String[] args) {
        SortedSet<String> set = new TreeSet<>();
        set.add("B");
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("C");
        set.add("C");
        set.add("E");
        set.add("B");
        set.add("D");
        System.out.println(set);
        System.out.println(set.first());
        System.out.println(set.last());
        System.out.println(set.headSet("C"));
        System.out.println(set.tailSet("C"));
        System.out.println(set.subSet("B","D"));
    }
}
