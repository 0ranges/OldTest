package Algs4.Sorting.Chapter2_1;

import Algs4.Fundamentals.Chapter1_4.Stopwatch;

import java.util.Scanner;

/**
 * Created by user on 2017/11/29.
 */
public class SortCompare {
    public static double time(String alg,Double[] a){
        Stopwatch timer = new Stopwatch();
        if(alg.equals("Insertion")) Insertion.sort(a);
        if(alg.equals("Selection")) Selection.sort(a);
        if(alg.equals("Shell"))     Shell.sort(a);
        if(alg.equals("Merge"))     Insertion.sort(a);
        if(alg.equals("Quick"))     Insertion.sort(a);
        if(alg.equals("Heap"))      Insertion.sort(a);
        return timer.elapsedTime();
    }
    public static double timeRandomInput(String alg,int N,int T){
        double total = 0.0;
        Double[] a = new Double[N];
        for(int i = 0 ;i<T;i++){
            for(int j = 0;j<N;j++)
                a[j] = Math.random();
            total += time(alg,a);
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int t = input.nextInt();
        //double t1 = timeRandomInput("Insertion",n,t);
        double t2 = timeRandomInput("Shell",n,t);
        //System.out.println("Insertion:"+t1);
        System.out.println("Shell:"+t2);
    }
}
