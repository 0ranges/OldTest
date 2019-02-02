package DesignPatterns.FactoryMethod;

/**
 * Created by user on 2017/4/7.
 */
public class FactoryDemo02 {
    public static void main(String args[]){
        Sender sender = new SendFactory02().produceMail();
        sender.send();
    }
}
//interface Sender{
//    public void send();
//}
//class MailSender implements Sender{
//    @Override
//    public void send(){
//        System.out.println("This is mailsender.");
//    }
//}
//class SmsSender implements Sender{
//    @Override
//    public void send(){
//        System.out.println("This is smssender.");
//    }
//}
class SendFactory02{
    public Sender produceMail(){
        return new MailSender();
    }
    public Sender produceSms(){
        return new SmsSender();
    }
}