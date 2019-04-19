package test;

import leetcode.BinaryTree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * Created by user on 2018/8/1.
 */
public class test01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        List<List<Integer>> lists = new ArrayList<>();
        for(int i = 0;i < n;i++){
            lists.add(new ArrayList<>());
        }
        for(int i = 0;i < m;i++){
            int a = input.nextInt();
            int b = input.nextInt();
            lists.get(a-1).add(b-1);
        }
        boolean[] stage = new boolean[n];
        int result = 0;
        for(int i = 0;i < n;i++){
            if(!stage[i]){
                search(i,stage,lists);
                result++;
            }
        }
        System.out.println(result);
    }
    private static void search(int i,boolean[] stage,List<List<Integer>> lists){
        for(int k : lists.get(i)){
            if(!stage[k]){
                stage[k] = true;
                search(k,stage,lists);
            }
        }
    }
}
