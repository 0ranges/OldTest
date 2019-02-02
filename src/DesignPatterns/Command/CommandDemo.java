package DesignPatterns.Command;

/**
 * Created by user on 2017/4/12.
 */
public class CommandDemo {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new MyCommand(receiver);
        Invoker invoker = new Invoker(command);
        invoker.action();
    }
}
interface Command{
    public void exe();
}
class MyCommand implements Command{
    private Receiver receiver;
    public MyCommand(Receiver receiver){
        this.receiver = receiver;
    }
    public void exe(){
        this.receiver.action();
    }
}
class Receiver{
    public void action(){
        System.out.println("Command received");
    }
}
class Invoker{
    private Command command;
    public Invoker(Command command){
        this.command = command;
    }
    public void action(){
        command.exe();
    }
}
