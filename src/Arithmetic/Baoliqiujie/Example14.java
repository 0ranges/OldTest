package Arithmetic.Baoliqiujie;

import java.util.Scanner;
import java.util.Vector;

/**
 * Created by user on 2017/5/19.
 */

/**
 * 埃及分数
 * fail
 */
public class Example14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b= input.nextInt();
        Vector<Integer> vector = new Vector<>();
        search(a,b,18,vector);
    }
    public static int num = 0;
    public static void search(int a,int b,int n,Vector<Integer> vector){
        for(int i = n;i>=2;i--){
            boolean flag = true;
            for(int j = 0;j<vector.size();j++){
                if(vector.get(j) == i)
                    flag = false;
            }
            if(flag)
                vector.add(i);
            else
                continue;
            if(judge(a,b,vector)==1){
                search(a,b,n,vector);
            }else if(judge(a,b,vector)==0){
                System.out.printf("%d/%d=",a,b);
                for(int v = vector.size()-1;v>=1;v--){
                    System.out.printf("1/%d+",vector.get(v));
                }
                System.out.printf("1/%d",vector.get(0));
            }else {
                vector.remove(vector.size()-1);
            }
        }
    }
    public static int judge(int a,int b,Vector<Integer> vector) {
        if (vector.size() == 0) {
            return 1;
        } else {
            int up = 0;
            int down = 1;
            for (int v : vector) {
                down *= v;
            }
            for (int v : vector) {
                up += down / v;
            }
            if (a * down < b * up) {
                return 1;
            } else if (a * down == b * up)
                return 0;
            else
                return -1;
        }
    }
}
