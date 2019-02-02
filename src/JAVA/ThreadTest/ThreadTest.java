package JAVA.ThreadTest;

/**
 * Created by user on 2017/3/17.
 */
public class ThreadTest {
    public static void main(String args[]){
        MyThread mt = new MyThread();
        Thread thread = new Thread(mt,"main");
        thread.start();
        try{
            Thread.sleep(15000);
        }catch (Exception e){

        }
        thread.interrupt();
    }
}
class MyThread implements Runnable{
    @Override
    public void run(){
        System.out.println("1,进入run方法");
        try{
            Thread.sleep(10000);
            System.out.println("2,已经完成休眠");
        }catch (Exception e){
            System.out.println("3,休眠被终止 ");
            return;
        }
        System.out.println("4,run方法正常运行");
    }
}