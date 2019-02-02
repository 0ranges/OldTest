package JAVA.ThreadTest;

/**
 * Created by user on 2017/3/18.
 */
public class ProducerAndConsumer02 {
    public static void main(String args[]){
        Info02 info02 = new Info02();
        Producer02 producer02 = new Producer02(info02);
        Consumer02 consumer02 = new Consumer02(info02);
        new Thread(producer02).start();
        new Thread(consumer02).start();
    }
}
class Info02{
    private String name = "Sam";
    private String content = "Student";
    public synchronized void set(String name,String content){
        this.name = name;
        try{
            Thread.sleep(300);
        }catch (Exception e){
            e.printStackTrace();
        }
        this.content = content;
    }
    public synchronized void get(){
        try{
            Thread.sleep(300);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(this.name + "----->"+this.content);
    }
}
class Producer02 implements Runnable{
    private Info02 info02 = null;
    public Producer02(Info02 info02){
        this.info02 = info02;
    }
    public void run(){
        boolean flag = false;
        for(int i = 0;i<50;i++) {
            if (flag) {
                this.info02.set("Sam", "Student");
                flag = false;
            }else {
                this.info02.set("Tom","Teacher");
                flag =true;
            }
        }
    }
}
class Consumer02 implements Runnable{
    private Info02 info02 = null;
    public Consumer02 (Info02 info02){
        this.info02 = info02;
    }
    public void run(){
        for(int i = 0;i<50;i++){
            try{
                Thread.sleep(100);
            }catch (Exception e){
                e.printStackTrace();
            }
            this.info02.get();
        }
    }
}