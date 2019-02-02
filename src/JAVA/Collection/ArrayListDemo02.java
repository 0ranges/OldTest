package JAVA.Collection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 2017/4/21.
 */
public class ArrayListDemo02 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        System.out.println("是否为空："+list.isEmpty());
        list.add("a");
        list.add("b");
        list.add("aa");
        list.add("bb");
        System.out.println(list.contains("aa")?"yes":"no");
        List<String> sublist = list.subList(2,3);
        System.out.println(sublist);
        System.out.println(list.indexOf("aa"));
        System.out.println(list.isEmpty());
    }
}
