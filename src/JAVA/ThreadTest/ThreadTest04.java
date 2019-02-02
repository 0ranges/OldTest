package JAVA.ThreadTest;

/**
 * Created by user on 2017/3/17.
 */
public class ThreadTest04 {
    public static void main(String args[]){
        MyThread04 mt = new MyThread04();
        Thread t = new Thread(mt);
        t.setDaemon(true);
        t.start();
    }
}
class MyThread04 implements Runnable{
    @Override
    public void run(){
        try{
            Thread.sleep(1000);
        }catch (Exception e){

        }
        while (true) {
            System.out.println("123");
        }
    }
}
