package Algs4.Sorting.Chapter2_4;

/**
 * Created by user on 2017/12/1.
 */
public class MaxPQ<Key extends Comparable<Key>> {
    private Key[] pq;
    private int N = 0;
    public MaxPQ(int maxN){
        pq = (Key[])(new Comparable[maxN+1]);
    }
    public boolean isEmpty(){
        return N == 0;
    }
    public int size(){
        return N;
    }
    private boolean less(int i,int j){
        return pq[i].compareTo(pq[j])<0;
    }
    private void exch(int i,int j){
        Key key = pq[i];
        pq[i] = pq[j];
        pq[j] = key;
    }
    private void swim(int k){
        while(k>1&&less(k/2,k)){
            exch(k/2,k);
            k = k/2;
        }
    }
    private void sink(int k){
        while (k*2<=N){
            int j = k*2;
            if(j<N&&less(j,j+1))
                j++;
            if(!less(k,j))
                break;
            exch(k,j);
            k = j;
        }
    }
    public void insert(Key v){
        pq[++N] = v;
        swim(N);
    }
    public Key delMax(){
        Key max = pq[1];
        exch(1,N--);
        pq[N+1] = null;
        sink(1);
        return max;
    }
}
