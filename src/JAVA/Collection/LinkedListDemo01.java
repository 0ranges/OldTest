package JAVA.Collection;

import java.util.LinkedList;

/**
 * Created by user on 2017/4/21.
 */
public class LinkedListDemo01 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(list);
        list.addFirst("X");
        list.addLast("Y");
        System.out.println(list);
    }
}
