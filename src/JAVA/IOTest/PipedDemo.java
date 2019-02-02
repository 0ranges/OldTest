package JAVA.IOTest;

import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * Created by user on 2017/4/3.
 */
public class PipedDemo {
    public static void main(String args[]){
        Send send = new Send();
        Receive receive = new Receive();
        try{
            send.getPos().connect(receive.getPis());
        }catch (Exception e){
            e.printStackTrace();
        }
        new Thread(send).run();
        new Thread(receive).run();
    }
}
class Send implements Runnable{
    private PipedOutputStream pos = null;
    public Send(){
        this.pos = new PipedOutputStream();
    }
    public void run(){
        String str = "hello world";
        try{
            this.pos.write(str.getBytes());
        }catch (Exception e){
            e.printStackTrace();
        }
        try{
            this.pos.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public PipedOutputStream getPos(){
        return this.pos;
    }
}
class Receive implements Runnable{
    private PipedInputStream pis = null;
    public Receive(){
        this.pis = new PipedInputStream();
    }
    public void run(){
        byte b[] = new byte[1024];
        int len = 0;
        try{
            len = this.pis.read(b);
        }catch (Exception e){
            e.printStackTrace();
        }
        try{
            this.pis.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("接受："+new String(b));
    }
    public PipedInputStream getPis(){
        return this.pis;
    }
}