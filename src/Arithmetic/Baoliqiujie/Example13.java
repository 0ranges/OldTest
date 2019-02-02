package Arithmetic.Baoliqiujie;

/**
 * Created by user on 2017/5/18.
 */

import java.util.Scanner;
import java.util.Vector;

/**
 * 困难的串
 * success
 */
public class Example13 {
    public static int num = 0;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Vector<Character> a = new Vector<>();
        int n = input.nextInt();
        int k = input.nextInt();
        search(n,k,a);
    }
    public static void search(int n,int k,Vector<Character> a){
      for(char i = 'A';i<'A'+n;i++){
            boolean flag = true;
            if(a.size()>0) {
                for (int j = 1; j <= (a.size() + 1) / 2; j++) {
                    int count = 0;
                    if (i == a.get(a.size() - j))
                        count++;
                    for (int m = 1; m < j; m++) {
                        if (a.get(a.size() - j - m) == a.get(a.size() - m))
                            count++;
                    }
                    if (j == count)
                        flag = false;
                }
            }
            if(flag){
                a.add(i);
                num++;
                //if(k == num){
                    for(char x:a)
                        System.out.print(x);
                    System.out.println();
               // }else {
                    search(n, k, a);
                    a.remove(a.size() - 1);
                //}
            }
        }
    }
}
