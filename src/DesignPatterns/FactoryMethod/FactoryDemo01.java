package DesignPatterns.FactoryMethod;

/**
 * Created by user on 2017/4/7.
 */
public class FactoryDemo01 {
    public static void main(String args[]){
        Sender sender = new SendFactory().produce("sms");
        sender.send();
    }
}
interface Sender{
    public void send();
}
class MailSender implements Sender{
    @Override
    public void send(){
        System.out.println("This is mailsender.");
    }
}
class SmsSender implements Sender{
    @Override
    public void send(){
        System.out.println("This is smssender.");
    }
}
class SendFactory{
    public Sender produce(String type){
        if("mail".equals(type)){
            return new MailSender();
        }else if("sms".equals(type)){
            return new SmsSender();
        }else {
            System.out.println("Error input.");
            return null;
        }
    }
}