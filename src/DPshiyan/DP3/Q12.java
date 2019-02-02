package DPshiyan.DP3;

/**
 * Created by user on 2018/1/14.
 */
public class Q12 {
    public static void main(String[] args) {
         DButil oButil=new SqlServer();
         oButil.Template();
    }
}
abstract class DButil {
    public void Template() {
        connDB();
        openDB();
        useDB();
        closeDB();
    }
    public abstract void connDB();
    public void openDB() {
        System.out.println("打开数据库");
    }
    public void useDB() {
        System.out.println("使用数据库");
    }
    public void closeDB() {
        System.out.println("关闭数据库");
    }
}
class Oracle extends DButil{
    public void connDB() {
        System.out.println("连接Oracle数据库");
    }
}
class SqlServer extends DButil{
    public void connDB() {
        System.out.println("连接SqlServer数据库");
    }
}