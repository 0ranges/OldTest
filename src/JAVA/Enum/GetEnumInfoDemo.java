package JAVA.Enum;

/**
 * Created by user on 2017/4/25.
 */
public class GetEnumInfoDemo {
    public static void main(String[] args) {
        for(Color01 c:Color01.values()){
            System.out.println(c.ordinal()+"   "+c.name());
        }
    }
}
