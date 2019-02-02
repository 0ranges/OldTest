package JAVA.JavaClass;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by user on 2017/3/28.
 */
public class DateDemo02 {
    public static void main(String args[]){
        DateFormat df1 = DateFormat.getDateInstance();
        DateFormat df2 = DateFormat.getDateTimeInstance();
        System.out.println(df1.format(new Date()));
        System.out.println(df2.format(new Date()));
        df1 = DateFormat.getDateInstance(DateFormat.YEAR_FIELD,new Locale("zh","CN"));
        df2 = DateFormat.getDateTimeInstance(DateFormat.YEAR_FIELD,DateFormat.ERA_FIELD,new Locale("zh","CN"));
        System.out.println(df1.format(new Date()));
        System.out.println(df2.format(new Date()));
    }
}
