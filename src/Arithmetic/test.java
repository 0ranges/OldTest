package Arithmetic;


import java.util.Scanner;
import java.util.Vector;

/**
 * Created by user on 2017/5/15.
 */
public class test {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        for(int i = 0;i<10000000;i++){
            vector.add(i);
        }
        long nowTime = System.currentTimeMillis();
        for(int i = 0;i<vector.size();i++){

        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-nowTime);
        int s = vector.size();
        System.out.println(s);
        nowTime = System.currentTimeMillis();
        for(int i = 0;i<s;i++){

        }
        endTime = System.currentTimeMillis();
        System.out.println(endTime-nowTime);
    }
}
