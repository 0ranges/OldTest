package DesignPatterns.Observe;


import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by user on 2017/4/11.
 */
public class ObserveDemo {
    public static void main(String args[]){
        Subject sub = new Myject();
        sub.add(new Observer1());
        sub.add(new Observer2());
        sub.operation();
    }
}
interface Observer{
    public void update();
}
class Observer1 implements Observer{
    @Override
    public void update(){
        System.out.println("ob1 has received message.");
    }
}
class Observer2 implements Observer{
    @Override
    public void update(){
        System.out.println("ob2 has received message.");
    }
}
interface Subject{

    /*增加观察者*/
    public void add(Observer observer);

    /*删除观察者*/
    public void del(Observer observer);

    /*通知所有的观察者*/
    public void notifyObservers();

    /*自身的操作*/
    public void operation();
}
abstract class AbstractSubject implements Subject{
    private Vector<Observer> vector = new Vector<>();
    public void add(Observer observer){
        vector.add(observer);
    }
    public void del(Observer observer){
        vector.remove(observer);
    }
    public void notifyObservers(){
        Enumeration<Observer> enomo = vector.elements();
        while(enomo.hasMoreElements()){
            enomo.nextElement().update();;
        }
    }
}
class Myject extends AbstractSubject{
    public void operation(){
        System.out.println("update self!");
        notifyObservers();
    }
}