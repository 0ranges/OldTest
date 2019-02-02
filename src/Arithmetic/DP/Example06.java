package Arithmetic.DP;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by user on 2017/6/5.
 */
/*
问题描述
N个方盒(box)摆成一排，每个方盒有自己的颜色。连续摆放的同颜色方盒构成
一个方盒片段(box segment)。下图中共有四个方盒片段，每个方盒片段分别有
1、4、3、1个方盒
玩家每次点击一个方盒，则该方盒所在方盒片段就会消失。若消失的方盒片段
中共有k个方盒，则玩家获得k*k个积分。
77
 请问：给定游戏开始时的状态，玩家可获得的最高积分是多少？
 输入：第一行是一个整数t(1<=t<=15)，表示共有多少组测试数据。每组测试
数据包括两行
 第一行是一个整数n(1<=n<=200),，表示共有多少个方盒
 第二行包括n个整数，表示每个方盒的颜色。这些整数的取值范围是[1 n]
 输出：对每组测试数据，分别输出该组测试数据的序号、以及玩家可以获得
的最高积分
 样例输入
2
c
1
1
 样例输出
Case 1: 29
Case 2: 1
 */
public class Example06 {
    public static int score[][][] = null;
    public static Box box[] = null;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        box = new Box[n];
        int lastA = 0;
        int index = 0;
        for(int i = 0;i<n;i++){
            int a = input.nextInt();
            if(a != lastA){
                Box b = new Box();
                b.color = a;
                b.len = 1;
                box[index] = b;
                index++;
                lastA = a;
            }else{
                box[index-1].len ++;
            }
        }
        score = new int[n][n][n];
        //System.out.println(index);
        System.out.println(click(0,index-1,0));
    }
    public static int click(int i,int j,int len){
        if(score[i][j][len] != 0){
            return score[i][j][len];
        }
        int result = (box[j].len+len)*(box[j].len+len);
        if(i==j)
            return result;
        result += click(i,j-1,0);
        for(int k = i;k<j;k++){
            if(box[j].color != box[k].color){
                continue;
            }
            int r = click(k+1,j-1,0)+click(i,k,box[j].len+len);
            result = Math.max(r,result);
        }
        score[i][j][len] = result;
        return result;
    }
    static class Box{
        public int len;
        public int color;
    }
}

