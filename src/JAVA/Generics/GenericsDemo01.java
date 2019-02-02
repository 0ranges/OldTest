package JAVA.Generics;

/**
 * Created by user on 2017/3/25.
 */
public class GenericsDemo01 {
    public static void main(String args[]){
        Point<Integer> point = new Point<Integer>();
        point.setX(30);
        point.setY(60);
        System.out.print(point.getX()+" "+point.getY());

    }
}
class Point<T>{
    private T x;
    private T y;

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public T getY() {
        return y;
    }

    public void setY(T y) {
        this.y = y;
    }
}
