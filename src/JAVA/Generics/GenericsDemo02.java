package JAVA.Generics;

/**
 * Created by user on 2017/3/25.
 */
public class GenericsDemo02 {
    public static void main(String args[]){
        Point01<String> point01 = new Point01<String>("abc");
        System.out.print(point01.getVar());
    }
}
class Point01<T>{
    private T var;
    public Point01(T var){
        this.var = var;
    }

    public T getVar() {
        return var;
    }

    public void setVar(T var) {
        this.var = var;
    }
}
