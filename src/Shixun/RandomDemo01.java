package Shixun;

/**
 * Created by user on 2017/9/6.
 */
public class RandomDemo01 {
    public static void main(String[] args) {
        int count[] = new int[20];
        int a;
        int n;
        for(int i = 0;i<10000;i++){
            a = (int)(Math.random()*10000);
            n = a/500;
            count[n]++;
        }
        int all = 0;
        for(int x:count) {
            System.out.println(x);
            all += x;
        }
        System.out.println(all);
    }
}
