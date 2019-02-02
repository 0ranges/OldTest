package JAVA.JavaClass;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by user on 2017/3/28.
 */
public class DateDemo {
    public static void main(String args[]){
        DateTime dt = new DateTime();
        System.out.println(dt.getDate());
        System.out.println(dt.getDateComplete());
        System.out.println(dt.getTimeStamp());
    }
}
class DateTime{
    private SimpleDateFormat sdf = null;
    public String getDate(){
        this.sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        return sdf.format(new Date());
    }
    public String getDateComplete(){
        this.sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒SSS毫秒");
        return sdf.format(new Date());
    }
    public String getTimeStamp(){
        this.sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        return sdf.format(new Date());
    }
}