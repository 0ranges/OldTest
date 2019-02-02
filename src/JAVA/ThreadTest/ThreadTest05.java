package JAVA.ThreadTest;

/**
 * Created by user on 2017/3/18.
 */
public class ThreadTest05 {
    public static void main(String args[]){
        MyThread05 mt1 = new MyThread05("A",10000);
        MyThread05 mt2 = new MyThread05("B",20000);
        MyThread05 mt3 = new MyThread05("C",30000);
        mt1.start();
        mt2.start();
        mt3.start();
    }
}
class MyThread05 extends Thread{
    private String name;
    private int time;
    public MyThread05(String name,int time){
        super(name);
        this.time = time;
    }
    @Override
    public void run(){
        try{
            Thread.sleep(this.time);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+" run "+this.time+" ms");
    }
}
