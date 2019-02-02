package Arithmetic.Exercise;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * Created by user on 2017/4/24.
 */
/*
描述
魔法师Silly Hook正在表演一个神奇的魔术，他变出了他自己的N个分身，并成正N边形分布，
他本身处于这个正N边形的中心，正N边形的边长为A。
然后，每个分身都会朝顺时针方向下一个分身以一个相同的固定的速度V移动，移动方向会随着下一个分身的位置变化而变化，
最终所有分身都将到达正N边形的中心，也就是回到Silly Hook本身，表演结束。

Silly Hook计划在比利时埃诺省Silly市巡回演出，他想提前知道对于每次表演需要多少时间。

输入
多组数据，到EOF结束。

每组数据一行三个整数N,A,V，分别表示 每次表演的分身个数，分身分布的正N边形的边长，每个分身移动的速度。

N ≤ 300 , A ≤ 400000 , V ≤ 10000 , 答案 ≤ 10000000 , 数据组数 ≤ 10

输出
每组数据一个实数，表示最后一个分身到达本身的时间，保留小数点后5位。

样例输入

3 10 5
4 20 8

样例输出

1.33333
2.50000
 */
public class Exercise01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        String str = null;
        while(input.hasNextLine()){
            str = input.nextLine();
            if("".equals(str.trim())){
                break;
            }else {
                list.add(str);
            }
        }
        for(int i = 0;i<list.size();i++){
            str = list.get(i).trim();
            int index1 = str.indexOf(' ');
            int index2 = str.indexOf(' ',index1+1);
            int n = Integer.parseInt(str.substring(0,index1));
            int a = Integer.parseInt(str.substring(index1+1,index2));
            int v = Integer.parseInt(str.substring(index2+1));
            double du = Math.PI*(n-2)/n;
            double ans = a*1.0/(v*1.0+v*Math.cos(du));
            System.out.printf("%.5f\n",ans);
        }
    }
}
