package JAVA.ThreadTest;

/**
 * Created by user on 2017/3/18.
 */
public class ProducerAndConsumer {
    public static void main(String args[]){
        Info info = new Info();
        Producer pro = new Producer(info);
        Consumer con = new Consumer(info);
        new Thread(pro).start();
        new Thread(con).start();
    }
}
class Info{
    private String name = "Tom";
    private String content = "Student";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
class Producer implements Runnable{
    private Info info = null;
    public Producer(Info info){
        this.info = info;
    }
    @Override
    public void run(){
        boolean flag = false;
        for(int i = 0;i<50;i++){
            if(flag){
                this.info.setName("Tom");
                try{
                    Thread.sleep(200);
                }catch (Exception e){
                    e.printStackTrace();
                }
                this.info.setContent("Student");
                flag = false;
            }else{
                this.info.setName("Sam");
                try{
                    Thread.sleep(200);
                }catch (Exception e){
                    e.printStackTrace();
                }
                this.info.setContent("Teacher");
                flag = true;
            }
        }
    }
}
class Consumer implements Runnable{
    private Info info = null;
    public Consumer(Info info){
        this.info = info;
    }
    @Override
    public void run(){

        for(int i = 0;i<50;i++){
           try{
               Thread.sleep(200);
           }catch (Exception e){
               e.printStackTrace();
           }
            System.out.println(this.info.getName()+"----->"+this.info.getContent());
        }
    }
}
