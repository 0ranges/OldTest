package JAVA.JavaClass;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by user on 2017/3/28.
 */
public class DateDemo01 {
    public static void main(String args[]){
        System.out.print(new Date());
        System.out.println();
        System.out.println(Calendar.YEAR);
        System.out.println(Calendar.MONDAY);
        System.out.println(Calendar.DAY_OF_MONTH);
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(1));
        System.out.println(calendar.get(2));
        System.out.println(calendar.get(3));
        System.out.println(calendar.get(4));
        System.out.println(calendar.get(5));
        System.out.println(calendar.get(6));

    }
}
