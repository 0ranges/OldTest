package Arithmetic.ShujujiegouTimu;

import java.util.Scanner;

/**
 * Created by user on 2017/4/23.
 */
/*
移动小球
你有一些小球，从左到右依次编号为1,2,3...,n
你可以执行两种命令。
其中，A X Y表示把小球X移动到小球Y的左边
B X Y表示把小球X移动到小球Y的右边
指令保证合法，即X不等于Y
输入小球个数n，指令条数m和m条指令，从左到右输出最后的序列
例子：
输入
6 2
A 1 4
B 3 5
输出：
2 1 4 5 3 6
 */
public class Example03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int index = input.nextInt();
        int res[] = new int[n];
        for(int i = 0;i<n;i++){
            res[i] = i+1;
        }
        for(int i = 0;i<index;i++) {
            String str = input.next();
            int x = input.nextInt();
            int y = input.nextInt();
            int index_x = find(res,x);
            int index_y = find(res,y);
            if("A".equals(str)){
                if(index_x>index_y){
                    for(int j = index_x;j>index_y;j--){
                        res[j] = res[j-1];
                    }
                    res[index_y] = x;
                }else if(index_x<index_y-1){
                    for(int j = index_x;j<index_y-1;j++){
                        res[j] = res[j+1];
                    }
                    res[index_y-1] = x;
                }
            }else if("B".equals(str)){
                if(index_x<index_y){
                    for(int j = index_x;j<index_y;j++){
                        res[j] = res[j+1];
                    }
                    res[index_y] = x;
                }else if(index_x>index_y+1){
                    for(int j = index_x;j>index_y+1;j--){
                        res[j] = res[j-1];
                    }
                    res[index_y+1] = x;
                }
            }
        }
        for(int i = 0;i<n;i++){
            System.out.printf("%s ",res[i]);
        }
    }
    public static int find(int res[],int a){
        for(int i = 0 ;i<res.length;i++){
            if(a == res[i])
                return i;
        }
        return -1;
    }
}
