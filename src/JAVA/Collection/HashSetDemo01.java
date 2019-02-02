package JAVA.Collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by user on 2017/4/22.
 */
public class HashSetDemo01 {
    public static void main(String[] args) {
        Set<String> allSet = new HashSet<>();
        allSet.add("B");
        allSet.add("C");
        allSet.add("B");
        allSet.add("B");
        allSet.add("B");
        allSet.add("A");
        allSet.add("C");
        allSet.add("C");
        allSet.add("D");
        allSet.add("E");
        allSet.add("A");
        System.out.println(allSet);
        System.out.println(allSet);
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("B");
        treeSet.add("C");
        treeSet.add("B");
        treeSet.add("B");
        treeSet.add("B");
        treeSet.add("A");
        treeSet.add("C");
        treeSet.add("C");
        treeSet.add("D");
        treeSet.add("E");
        treeSet.add("A");
        System.out.println(treeSet);
    }
}
