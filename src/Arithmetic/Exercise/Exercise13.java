package Arithmetic.Exercise;

/**
 * Created by user on 2017/5/24.
 */

import java.util.Scanner;
import java.util.Vector;

/**
 * Description
 一叠数值不同的扑克牌（不超过13张），每次只能拿最顶端的一张插入到任意位置。至少操作多少次，扑克牌能够从上到下是从大到小的顺序。

 Input
 多组数据，每组第一行为n，扑克牌个数。第二行n个空格隔开的正整数，（这些数是1~13），为这叠扑克牌从下到上的数值。

 Output
 每组数据输出一行，至少按规则操作的次数。

 Sample Input
 3
 1 3 2
 5
 1 3 5 2 6
 Sample Output
 1
 2
 */
public class Exercise13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Vector<Integer> result = new Vector<>();
        while(input.hasNextInt()){
            int n = input.nextInt();
            int pai[] = new int[n];
            for(int i = 0;i<n;i++){
                pai[i] = input.nextInt();
            }
            result.add(found(pai));
        }
        for(int i:result)
            System.out.println(i);
    }
    public static int found(int pai[]){
        int i;
        for(i = 0;i<pai.length-1;i++){
            if (pai[i] > pai[i+1]) {
                break;
            }
        }
        return pai.length-1-i;
    }
}
