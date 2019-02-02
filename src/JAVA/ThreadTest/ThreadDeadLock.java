package JAVA.ThreadTest;

/**
 * Created by user on 2017/3/18.
 */
public class ThreadDeadLock implements Runnable{
    private static Zhangsan zs = new Zhangsan();
    private static Lisi ls = new Lisi();
    public  boolean flag = false;
    public void run(){
        if(flag){
            synchronized (zs){
                zs.say();
                try{
                    Thread.sleep(500);
                }catch (Exception e){
                    e.printStackTrace();
                }
                synchronized (ls){
                    zs.get();
                }
            }
        }else{
            synchronized (ls){
                ls.say();
                try{
                    Thread.sleep(500);
                }catch (Exception e){
                    e.printStackTrace();
                }
                synchronized (zs){
                    ls.get();
                }
            }
        }
    }
    public static void main(String args[]){
        ThreadDeadLock th1 = new ThreadDeadLock();
        ThreadDeadLock th2 = new ThreadDeadLock();
        th1.flag = true;
        th2.flag = false;
        Thread thread01 = new Thread(th1);
        Thread thread02 = new Thread(th2);
        thread01.start();
        thread02.start();
    }
}
class Zhangsan{
    public void say(){
        System.out.println("张三对李四说：“你给我画，我就把书给你”");
    }
    public void get(){
        System.out.println("张三得到了画");
    }
}
class Lisi{
    public void say(){
        System.out.println("李四对张三说：“你给我书，我就把画给你”");
    }
    public void get(){
        System.out.println("李四得到了书");
    }
}
