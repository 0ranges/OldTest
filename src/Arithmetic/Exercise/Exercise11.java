package Arithmetic.Exercise;

import java.util.Scanner;
import java.util.Vector;

/**
 * Created by user on 2017/5/22.
 */
public class Exercise11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Vector<Integer> vector = new Vector<>();
        while (input.hasNext()){
            String str = input.next();
            int n = input.nextInt();
            int count = 0;
            for(int i = 0;i<n;i++) {
                String s = input.next();
                if (str.equals(s))
                    count++;
            }
            vector.add(count);
        }
        for(int n:vector)
            System.out.println(n);
    }
}
