package Algs4.Fundamentals.Chapter1_4;

/**
 * Created by user on 2017/11/29.
 */
public class Stopwatch {
    private final long start;
    public Stopwatch(){
        start = System.currentTimeMillis();
    }
    public double elapsedTime(){
        long now = System.currentTimeMillis();
        return (now-start)/1000.0;
    }
}
