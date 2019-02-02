package Arithmetic;

import java.util.Vector;

/*
 *Created by user on 2017/4/15.
 */
/*
* 问题描述：求10000以内的完数。
* 完数即：一个数等于它的不同因子的和
* 如6=1+2+3.8!=1+2+4
* xtfggef 2012/5/16
*/
public class Wanshu {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<Integer>();
        for(int i = 2 ;i<10000;i++){
            int sum = 1;
            for(int j = 2;j<=i/2;j++){
                if(i%j==0){
                    sum = sum + j;
                }
            }
            if(sum == i)
                vector.add(i);
        }
        for(int i = 0;i<vector.size();i++){
            System.out.print(vector.get(i) +"\t");
            if((i+1)%10 == 0)
                System.out.println();
        }
    }
}
