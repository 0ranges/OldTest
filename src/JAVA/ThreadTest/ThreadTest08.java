package JAVA.ThreadTest;

/**
 * Created by user on 2017/3/18.
 */
public class ThreadTest08 {
    public static void main(String args[]){
        MyThread08 myThread08 = new MyThread08();
        Thread mt1 = new Thread(myThread08);
        Thread mt2 = new Thread(myThread08);
        Thread mt3 = new Thread(myThread08);
        mt1.start();
        mt2.start();
        mt3.start();
    }
}
class MyThread08 implements Runnable{
    private int time = 15;
    @Override
    public void run(){
        for(int i = 0 ;i<100;i++){
            this.sale();
        }
    }
    private synchronized void sale(){
        if(time>0) {
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+ " Tickets left: " + this.time);
            this.time--;
        }
    }
}