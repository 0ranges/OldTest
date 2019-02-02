package JAVA.Generics;

/**
 * Created by user on 2017/3/25.
 */
public class GenericsDemo11 {
    public static void main(String args[]){
        Demo<Infa<String,Integer>> demo = null;
        Infa<String,Integer> infa = null;
        infa = new Infa<>("abc",123);
        demo = new Demo<>(infa);
        System.out.println(demo.getInfo().getValue());
        System.out.println(demo.getInfo().getVar());
    }
}
class Infa<T,V>{
    private T var;
    private V value;
    public Infa(T var,V value){
        this.var = var;
        this.value = value;
    }

    public T getVar() {
        return var;
    }

    public void setVar(T var) {
        this.var = var;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
class Demo<S>{
    private S info;
    public Demo(S info){
        this.info = info;
    }

    public S getInfo() {
        return info;
    }

    public void setInfo(S info) {
        this.info = info;
    }
}