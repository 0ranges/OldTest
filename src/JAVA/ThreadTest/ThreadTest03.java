package JAVA.ThreadTest;

/**
 * Created by user on 2017/3/17.
 */
public class ThreadTest03 {
    public static void main(String args[]){
        MyThread03 mt1 = new MyThread03();
        MyThread03 mt2 = new MyThread03();
        MyThread03 mt3 = new MyThread03();
        mt1.setPriority(Thread.MAX_PRIORITY);
        mt2.setPriority(Thread.NORM_PRIORITY);
        mt3.setPriority(Thread.MIN_PRIORITY);
        mt1.start();
        mt2.start();
        mt3.start();
    }
}
class MyThread03 extends Thread{
    private int time = 100;
    @Override
    public void run(){
        for(int i = 0 ; i<100;i++ ){
            if(time >0){
                System.out.println(Thread.currentThread().getName()+" left:"+time);
                time --;
            }
        }
    }
}
