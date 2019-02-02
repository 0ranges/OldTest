package Arithmetic.Baoliqiujie;

import java.util.Scanner;
import java.util.Vector;

/**
 * Created by user on 2017/4/25.
 */
/*
分数拆分
输入正整数k，找到所有的正整数x>=y,使得1/k=1/x+1/y
例子：
输入：
2
12
输出：
2
1/2=1/6+1/3
1/2=1/4+1/4
8
1/12=1/156+1/13
1/12=1/84+1/14
1/12=1/60+1/15
1/12=1/48+1/16
1/12=1/36+1/18
1/12=1/30+1/20
1/12=1/28+1/21
1/12=1/24+1/24

 */
public class Example03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Vector<Integer> vector = new Vector<>();
        while(input.hasNextLine()){
            String str = input.nextLine().trim();
            if("".equals(str)){
                break;
            }else{
                vector.add(Integer.parseInt(str));
            }
        }
        for(int i = 0;i<vector.size();i++){
            int count = 0;
            Vector<Integer> first = new Vector<>();
            Vector<Integer> second = new Vector<>();
            int n = vector.get(i);
            for(int j = n+1;j<=n*2;j++){
                int down = n*j;
                int up = j-n;
                if(down%up == 0){
                    first.add(down/up);
                    second.add(j);
                    count++;
                }
            }
            System.out.printf("%d\n",count);
            for(int j = 0;j<first.size();j++){
                System.out.printf("1/%d=1/%d+1/%d\n",n,first.get(j),second.get(j));
            }
        }
    }
}
