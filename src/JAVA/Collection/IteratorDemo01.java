package JAVA.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by user on 2017/4/22.
 */
public class IteratorDemo01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("B");
        list.add("A");
        list.add("C");
        Iterator<String> it = list.iterator();
//        while(it.hasNext()){
//            System.out.print(it.next()+".");
//        }
        while (it.hasNext()){
            String str = it.next();
            if("A".equals(str)){
                it.remove();
            }else {
                System.out.print(str+".");
            }
        }
    }
}
