package JAVA.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by user on 2017/4/21.
 */
public class ArrayListDemo01 {
    public static void main(String[] args) {
        List<String> allList = new ArrayList<>();
        Collection<String> allCollection = new ArrayList<>();
        allList.add("hello");
        allList.add(0,"world");
        System.out.println(allList);
        allCollection.add("Sam");
        allCollection.add("www.baidu.com");
        System.out.println(allCollection);
        allList.addAll(allCollection);
        allList.addAll(0,allCollection);
//        System.out.println(allList);
//        allList.remove(0);
        System.out.println(allList);
        allList.remove("world");
        System.out.println(allList);
        allList.removeAll(allCollection);
        System.out.println(allList);
        allList.add("Amy");
        allList.add("Mi");
        Object o[] = allList.toArray();
        for(int i = 0;i<allList.size();i++){
            System.out.println((String)o[i]+" "+allList.get(i));
        }
    }
}
