package Shixun;

/**
 * Created by user on 2017/9/5.
 */
public class Price {
    public static void main(String[] args) {
        Parker bus = new Bus();
        System.out.println(bus.getPrice());
        Parker vehicle = new Vehicle();
        System.out.println(vehicle.getPrice());
        Parker car = new Car();
        System.out.println(car.getPrice());
    }
}
interface Parker{
    public int getPrice();
}
class Vehicle implements Parker{
    private int price = 15;
    public int getPrice(){
        return this.price;
    }
}
class Bus implements Parker{
    private int price = 12;
    public int getPrice(){
        return this.price;
    }
}
class Car implements Parker{
    private int price = 8;
    public int getPrice(){
        return this.price;
    }
}