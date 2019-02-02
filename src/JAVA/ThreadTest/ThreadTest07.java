package JAVA.ThreadTest;

/**
 * Created by user on 2017/3/18.
 */
public class ThreadTest07 {
    public static void main(String args[]){
        MyThread07 myThread07 = new MyThread07();
        Thread mt1 = new Thread(myThread07);
        Thread mt2 = new Thread(myThread07);
        Thread mt3 = new Thread(myThread07);
        mt1.start();
        mt2.start();
        mt3.start();
    }
}
class MyThread07 implements Runnable{
    private int tiket = 5;
    @Override
    public void run(){
        for(int i = 0;i<100;i++){
            synchronized (this) {
                if (tiket > 0) {
                    try {
                        Thread.sleep(500);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    tiket--;
                    System.out.println("Tickets left: " + this.tiket);
                }
            }
        }
    }
}
