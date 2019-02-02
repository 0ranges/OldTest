package DesignPatterns.Builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 2017/4/7.
 */
public class BuilderDemo {
    public static void main(String args[]){
        Builder builder = new Builder();
        builder.produceMail(5);
        builder.produceSms(2);
    }
}
interface Sender{
    public void send();
}
class MailSender implements Sender{
    public void send(){
        System.out.println("This is mail.");
    }
}
class SmsSender implements Sender{
    public void send(){
        System.out.println("This is sms.");
    }
}
class Builder{
    private List<Sender> list = new ArrayList<>();
    public void produceMail(int count){
        for(int i = 0;i<count;i++){
            Sender sender = new MailSender();
            list.add(sender);
            sender.send();
        }
    }
    public void produceSms(int count){
        for(int i = 0;i<count;i++){
            Sender sender = new SmsSender();
            list.add(sender);
            sender.send();
        }
    }
}