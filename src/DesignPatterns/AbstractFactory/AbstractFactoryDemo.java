package DesignPatterns.AbstractFactory;

/**
 * Created by user on 2017/4/7.
 */
public class AbstractFactoryDemo {
    public static void main(String args[]){
        Sender sender = new MailProvider().produce();
        sender.send();
        sender = new SmsProvider().produce();
        sender.send();
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
interface Provider{
    public Sender produce();
}
class MailProvider implements Provider{
    public Sender produce(){
        return new MailSender();
    }
}
class SmsProvider implements Provider{
    public Sender produce(){
        return new SmsSender();
    }
}