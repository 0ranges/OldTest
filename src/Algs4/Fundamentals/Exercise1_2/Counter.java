package Algs4.Fundamentals.Exercise1_2;

/**
 * Created by user on 2017/11/23.
 */
public class Counter {
    private final String name;
    private int count;
    public Counter(String id){
        name = id;
    }
    public void increment(){
        count++;
    }
    public int tally(){
        return count;
    }
    public String toString(){
        return count+" "+name;
    }
}
