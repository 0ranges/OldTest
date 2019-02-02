package JAVA.JavaClass01;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by user on 2017/3/30.
 */
public class TimerTaskDemo {
    public static void main(String args[]){
        Timer t = new Timer();
        MyTask myTask = new MyTask();
        t.schedule(myTask,2000,500);
    }
}
class MyTask extends TimerTask{
    public void run(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        System.out.println(sdf.format(new Date()));
    }
}