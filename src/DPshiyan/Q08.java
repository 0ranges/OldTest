package DPshiyan;

/**
 * Created by user on 2017/12/24.
 */
public class Q08 {
}

class PassengerPlane extends Airplane {
    @Override
    public void fly() {
        System.out.println("This is Passenger Plane fly.");
    }
}
abstract class Airplane{
    abstract public void fly();
    protected AirplaneMaker airplaneMaker;
}
class CargoPlane extends Airplane {
    @Override
    public void fly() {
        System.out.println("This is CargoPlane fly.");
    }
}
abstract class AirplaneMaker {
    abstract public void produce();
}
class Airbus extends AirplaneMaker {
    @Override
    public void produce(){
        System.out.println("Airbus>>>>>>>>");
    }
}
class Boeing extends AirplaneMaker {
    @Override
    public void produce(){
        System.out.println("Boeing>>>>>>>>");
    }
}
class MD extends AirplaneMaker {
    @Override
    public void produce(){
        System.out.println("Boeing>>>>>>>>");
    }
}