package Algs4.Fundamentals.Chapter1_3;

/**
 * Created by user on 2017/11/24.
 */
public class FixedCapacityStackOfStrings {
    private String[] a;
    private int N;
    public FixedCapacityStackOfStrings(int cap){
        a = new String[cap];
    }
    public boolean isEmpty(){
        return N==0;
    }
    public int size(){
        return N;
    }
    public void push(String item){
        a[N++] = item;
    }
    public String pop(){
        return a[--N];
    }
    //Exercise1_1 Ex01
    public boolean isFull(){
        return N == a.length;
    }
}
