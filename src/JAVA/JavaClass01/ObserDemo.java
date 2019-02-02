package JAVA.JavaClass01;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by user on 2017/3/29.
 */
public class ObserDemo {
    public static void main(String args[]){
        House h = new House(100000);
        HousePriceObverser hpo1 = new HousePriceObverser("A");
        HousePriceObverser hpo2 = new HousePriceObverser("B");
        HousePriceObverser hpo3 = new HousePriceObverser("C");
        h.addObserver(hpo1);
        h.addObserver(hpo2);
        h.addObserver(hpo3);
        System.out.println(h.getPrice());
        h.setPrice(6666);
        System.out.println(h.getPrice());
    }
}
class House extends Observable{
    private float price;
    public House(float price){
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        super.setChanged();
        super.notifyObservers(price);
        this.price = price;
    }
}
class HousePriceObverser implements Observer {
    private String name;
    public HousePriceObverser(String name){
        this.name = name;
    }
    public void update(Observable obj,Object object){
        if(object instanceof Float){
            System.out.println(this.name+"价格变为："+ (Float) object);
        }
    }
}