package DesignPatterns.FactoryMethod;

/**
 * Created by user on 2017/4/7.
 */
public class FactoryDemo03 {
    public static void main(String args[]){
        Sender sender = SendFactory03.produceMail();
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
class SendFactory03{
    public static Sender produceMail(){
        return new MailSender();
    }
    public static Sender produceSms(){
        return new SmsSender();
    }
}
