package JAVA.JavaClass;

import java.util.Random;

/**
 * Created by user on 2017/3/28.
 */
public class RandomDemo {
    public static void main(String args[]){
        Random random = new Random();
        for (int i = 0;i<100;i++){
            System.out.print(random.nextInt(100)+"\t");
        }
    }
}
