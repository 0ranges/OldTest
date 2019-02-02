package DPshiyan.DP3;

/**
 * Created by user on 2018/1/13.
 */
public class Q03 {
    public static void main(String[] args) {
        AbstractLog abstractLog = (AbstractLog)XMLUtil.getBean("abstractLog");
        abstractLog.method();
    }
}
interface AbstractLog{
    public void method();
}
class ReadLog implements AbstractLog{
    public void method(){
        System.out.println("方法method()执行中");
    }
}
class ProxyLog implements AbstractLog{
    private ReadLog readLog;
    public ProxyLog(){
        readLog = new ReadLog();
    }
    public void method(){
        preMethod();
        readLog.method();
        postRequest();
    }
    public void preMethod(){
        System.out.println("方法method()被调用");
    }
    public void postRequest(){
        System.out.println("方法method()执行成功");
    }
}