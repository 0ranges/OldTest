package JAVA.ThreadTest;

/**
 * Created by user on 2017/3/17.
 */
public class ThreadTest02 {
    public static void main(String args[]){
        MyThread02 my = new MyThread02();
        //new Thread(my,"01").start();
        //new Thread(my,"02").start();
        //new Thread(my,"03").start();
        Thread thread01 = new Thread(my,"01");
        Thread thread02 = new Thread(my,"02");
        Thread thread03 = new Thread(my,"03");
        thread01.start();
        thread02.start();
        try {
            thread02.join();
        }catch (Exception e){

        }
        finally {
            thread03.start();
        }
    }
}
class MyThread02 implements Runnable{
    private int time = 100;
    @Override
    public void run(){
        for(int i = 0 ; i<10;i++ ){
            if(time >0){
                System.out.println(Thread.currentThread().getName()+" left:"+time);
                time --;
            }
        }
    }
}
