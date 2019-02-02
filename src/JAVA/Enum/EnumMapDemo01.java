package JAVA.Enum;

import java.util.EnumMap;
import java.util.Map;

/**
 * Created by user on 2017/4/25.
 */
public class EnumMapDemo01 {
    public static void main(String[] args) {
        Map<Color02,String> desc = new EnumMap<>(Color02.class);
        desc.put(Color02.BLUE,"蓝色");
        desc.put(Color02.GREEN,"绿色");
        desc.put(Color02.RED,"红色");
        for(Color02 c:Color02.values()){
            System.out.println(c.name()+"  "+desc.get(c));
        }
        for(Color02 c:desc.keySet()){
            System.out.print(c.name()+" ");
        }
        System.out.println();
        for(String c:desc.values()){
            System.out.println(c);
        }
    }
}
enum Color02{
    RED,GREEN,BLUE;
}