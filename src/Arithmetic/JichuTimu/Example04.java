package Arithmetic.JichuTimu;

import java.util.Scanner;
import java.util.Vector;

/**
 * Created by user on 2017/4/19.
 */
/*
小学生算术
计算两个整数在相加时需要多少次进位。
可以连续处理多组数据，知道读到两个0为止
假设输入的整数都不超过9个数字
例子：
输入：
123 456
555 555
123 594
0 0
输出：
0
3
1
 */
public class Example04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Vector<String> vector = new Vector<>();
        while(input.hasNextLine()){
            String str = input.nextLine();
            if (!"0 0".equals(str.trim())) {
                vector.add(str);
            }else{
                break;
            }
        }
        for(int i = 0;i<vector.size();i++){
            int a,b = 0;
            int count = 0;
            int num = 0;
            a = Integer.parseInt(vector.get(i).trim().substring(0,vector.get(i).trim().indexOf(" ")));
            b = Integer.parseInt(vector.get(i).trim().substring(vector.get(i).trim().indexOf(" ")+1));
            for(int j = 0;j < 9;j++){
                count = (a%10+b%10+count)>9?1:0;
                num += count;
                a /= 10;
                b /= 10;
            }
            System.out.printf("%d\n",num);
        }
    }
}
