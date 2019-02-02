package Algs4.Sorting.Chapter2_1;

/**
 * Created by user on 2017/11/29.
 */
/*
 * 选择排序
 * 特点
 * 1.运行时间和输入无关
 * 2.数据移动最少
 */
public class Selection extends Example{
        public static void sort(Comparable[] a){
        int n = a.length;
        for(int i = 0;i<n;i++){
            int min = i;
            for(int j = i+1;j<n;j++){
                if(less(a[j],a[min]))
                    min = j;
            }
            exch(a,min,i);
        }
    }
    public static void main(String[] args){
        String[] a = {"S","O","R","T","E","X","A","M","P","L","E"};
        sort(a);
        show(a);
    }
}
