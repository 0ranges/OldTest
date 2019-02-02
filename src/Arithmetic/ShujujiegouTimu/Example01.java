package Arithmetic.ShujujiegouTimu;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by user on 2017/4/21.
 */
/*
卡片游戏
桌上有一叠牌，从第一张牌（即位于顶面的牌）开始从上往下依次编号为1~n。
当至少还剩两张牌时进行以下操作：把第一张牌扔掉，然后把新的第一张放到整叠牌的最后。
输入n，输出每次扔掉的牌，以及最后剩下的牌。
例子：
输入：7
输出：1 3 5 7 4 2 6
 */
public class Example01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0;i<num;i++){
            queue.add((i+1));
        }
        while(!queue.isEmpty()){
            System.out.printf("%d ",queue.peek());
            queue.poll();
            queue.offer(queue.peek());
            queue.poll();
        }
    }
}
