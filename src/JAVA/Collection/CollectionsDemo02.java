package JAVA.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by user on 2017/4/23.
 */
public class CollectionsDemo02 {
    public static void main(String[] args) {
        List<String>  list = new ArrayList<>();
        Collections.addAll(list,"ab","b","c","b");
        System.out.println(list);
       // Collections.reverse(list);
       // System.out.println(list);
        System.out.println(Collections.binarySearch(list,"c"));
        System.out.println(Collections.replaceAll(list,"b","B"));
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.swap(list,1,2);
        System.out.println(list);
    }
}
