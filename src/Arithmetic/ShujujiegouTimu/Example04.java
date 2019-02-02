package Arithmetic.ShujujiegouTimu;

import java.util.Scanner;

/**
 * Created by user on 2017/4/23.
 */
/*
小球下落
有一颗二叉树，最大深度为D，且所有叶子的深度都相同。
所有结点从上到下从左到右编号为1,2,3...2^D-1。
在节点1处放一个小球，它会往下落。每个内结点上都有一个开关，初始全部关闭，
当每次有小球落到一个开关上时，它的状态都会改变。
当小球到达一个内结点时，如果该结点上的开关关闭，则往左走，否则往右走，
知道走到叶子节点

一些小球从节点1处依次开始下落，最后一个小球将会落到哪里呢
输入叶子深度D和小球个数I，输出第I个小球最后所在的叶子编号。
假设I不超过整棵树的叶子个数。D<=20,，输入最多包含1000组数据

例子：
输入：
4 2
3 4
10 1
2 2
8 128
16 12345
输出：
12
7
512
3
255
36358

 */
public class Example04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int depth = input.nextInt();
        int num = input.nextInt();
        boolean tree[] = new boolean[(int)Math.pow(2,depth)];
        for(int i = 0;i<tree.length;i++){
            tree[i] = false;
        }
        int k = 0;
        int n = (int)Math.pow(2,depth)-1;
        for(int i = 0;i<num;i++){
            k = 1;
            for(int j = 0;j<depth;j++){
                tree[k] = !tree[k];
                k = tree[k]?k*2:k*2+1;
                if(k>n)
                    break;
            }
        }
        System.out.println(k/2);
    }
}
