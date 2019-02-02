package DPshiyan.DP3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 2018/1/13.
 */
public class Q08 {
    public static void main(String[] args) {
        MySubject subject = new Stock();
        MyObserver observer01 = new Investor();
        MyObserver observer02 = new Investor();
        MyObserver observer03 = new Investor();
        subject.add(observer01);
        subject.add(observer02);
        subject.add(observer03);
        subject.notice();
    }
}
interface MyObserver{
    public void update();
}
class Investor implements MyObserver{
    public void update(){
        System.out.println("股民已知情");
    }
}
abstract class MySubject{
    public List<MyObserver> observers = new ArrayList<>();
    public void add(MyObserver observer){
        observers.add(observer);
    }
    public void remove(MyObserver observer){
        observers.remove(observer);
    }
    public void notice(){};
}
class Stock extends MySubject{
    public void notice(){
        System.out.println("股票价格变化幅度达到5%时");
        for(MyObserver observer:observers)
            observer.update();
    }
}