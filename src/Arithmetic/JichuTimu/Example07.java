package Arithmetic.JichuTimu;

import java.util.Scanner;

/**
 * Created by user on 2017/4/20.
 */
/*
Cantor的数表
如下列数，第一项为1/1，第二项是1/2，第三项是2/1，第四项是3/1，第五项是2/2，、、、
输入n，输出第n项
1/1 1/2 1/3 1/4 1/5
2/1 2/2 2/3 2/4
3/1 3/2 3/3
4/1 4/2
5/1
例子：
输入：
3
14
7
12345
输出：
2/1
2/4
1/4
59/99

 */
public class Example07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int index = 1;
        while(num>(index*(index+1)/2)){
            index++;
        }
        int a = num - index*(index-1)/2;
        int b = index + 1 - a;
        if(index % 2 != 0){
            System.out.printf("%d/%d",b,a);
        }else {
            System.out.printf("%d/%d",a,b);
        }
    }
}
