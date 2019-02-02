package Arithmetic.JichuTimu;

import java.util.Scanner;
import java.util.Vector;

/**
 * Created by user on 2017/4/20.
 */
/*
6174问题
假设你有一个各位数字互不相同的四位数，把所有数字从大到小排序得到a，
从小到大排序得到b，然后用a-b代替这个数，并继续操作。
从1234开始，依次得到4321-1234=3087、8730-378=8352、8532-2358=6174、
7641-1467=6174，回到了它自己。
输入一个n位数，输出操作序列，知道出现循环为止。输入保证在循环之前最多产生1000个整数。
例子：
输入：1234
输出：1234->3087->8352->6174->6174
 */
public class Example06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        Vector<Integer> vector = new Vector<>();
        vector.add(num);
        System.out.printf("%d->",vector.get(0));
        boolean flag = false;
        for(int i = 1;i<1000;i++) {
            vector.add(getNext(vector.get(i - 1)));
            for (int j = i - 1; j >= 0; j--) {
                if (vector.get(i).equals(vector.get(j))) {
                    flag = true;
                }
            }
            if (flag) {
                System.out.printf("%d", vector.get(i));
                break;
            } else {
                System.out.printf("%d->", vector.get(i));
            }
        }
    }
    public static int getNext(int num){
        char c[] = String.valueOf(num).trim().toCharArray();
        for(int i = 0;i<c.length;i++){
            for(int j = i;j<c.length;j++){
                if(c[j]>c[i]) {
                    char t = c[j];
                    c[j] = c[i];
                    c[i] = t;
                }
            }
        }
        int b = Integer.parseInt(new String(c));
        for(int i = 0;i<c.length/2;i++){
            char t = c[i];
            c[i] = c[c.length-1-i];
            c[c.length-1-i] = t;
        }
        int a = Integer.parseInt(new String(c));
        return b-a;
    }
}
