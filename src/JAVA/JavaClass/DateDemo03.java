package JAVA.JavaClass;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by user on 2017/3/28.
 */
public class DateDemo03 {
    public static void main(String args[]){
        String str = "2017-03-28 21:37";
        String pat1 = "yyyy-MM-dd HH:mm";
        String pat2 = "yyyy年MM月dd日HH时mm分";
        SimpleDateFormat sdf1 = new SimpleDateFormat(pat1);
        SimpleDateFormat sdf2 = new SimpleDateFormat(pat2);
        Date date = null;
        try{
            date = sdf1.parse(str);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.print(sdf2.format(date));
    }
}
