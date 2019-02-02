package Algs4.Sorting.Exercise2_4;

/**
 * Created by user on 2017/11/30.
 */
public class UnorderedArrayMaxPQ<Key extends Comparable<Key>> {
    private Key[] pq;
    private int n;
    public UnorderedArrayMaxPQ(int capacity){
        pq = (Key[])(new Comparable[capacity]);
        n = 0;
    }
    public boolean isEmpty(){
        return n == 0;
    }
    public int size(){
        return n;
    }
    public void insert(Key key){
        pq[n++] = key;
    }
    public Key delMax(){
        int max = 0;
        for(int i = 1;i<n;i++)
            if(less(max,i))
                max = i;
        exch(max,n-1);
        return pq[--n];
    }
    private boolean less(int i,int j){
        return pq[i].compareTo(pq[j])<0;
    }
    private void exch(int i,int j){
        Key swap = pq[i];
        pq[i] = pq[j];
        pq[j] = swap;
    }
}
