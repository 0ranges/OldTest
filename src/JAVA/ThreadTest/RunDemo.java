package JAVA.ThreadTest;

/**
 * Created by user on 2017/5/31.
 */
public class RunDemo {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(6);
        System.out.println(Thread.currentThread().getPriority());
        MT01 mt01 = new MT01();
        mt01.start();
    }
}
class MT01 extends Thread{
    @Override
    public void run() {
        System.out.println(this.getPriority());
    }
}
