package JAVA.ThreadTest;

/**
 * Created by user on 2017/3/18.
 */
public class ThreadTest06 {
    public static void main(String args[]){
        new Thread(new MyThread06("A",1000)).start();
        new Thread(new MyThread06("B",2000)).start();
        new Thread(new MyThread06("C",3000)).start();
    }
}
class MyThread06 implements Runnable{
    private String name;
    private int time;
    public MyThread06(String name,int time){
        this.name = name;
        this.time = time;
    }
    @Override
    public void run(){
        try{
            Thread.sleep(this.time);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+ " run "+this.time+"ms");
    }
}
