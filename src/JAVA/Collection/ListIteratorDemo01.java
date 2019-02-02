package JAVA.Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by user on 2017/4/22.
 */
public class ListIteratorDemo01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("B");
        list.add("A");
        list.add("C");
        list.add("D");
        ListIterator<String> iter = list.listIterator();
        System.out.print("由前向后输出：");
        while(iter.hasNext()){
            System.out.printf("%s,",iter.next());
        }
        System.out.println();
        for(String str:list){
            System.out.print(str+",");
        }
        System.out.println();
        System.out.print("由后向前输出：");
        iter.add("E");
        while(iter.hasPrevious()){
            System.out.printf("%s,",iter.previous());
        }
    }
}
