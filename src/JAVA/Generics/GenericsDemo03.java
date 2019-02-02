package JAVA.Generics;

/**
 * Created by user on 2017/3/25.
 */
public class GenericsDemo03 {
    public static void main(String args[]){
        Point03<String,Integer> point03 = new Point03<>();
        point03.setKey("hello");
        point03.setValue(10);
        System.out.print(point03.getKey() + point03.getValue());
    }
}
class Point03<K,V>{
    private K key;
    private V value;

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}