package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 2018/7/30.
 */
public class Q098 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public static void main(String[] args) {
        System.out.println(isValidBST(null));
    }

    public static boolean isValidBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        search(root, list);
        for(int i = 0;i<list.size()-1;i++){
            if(list.get(i)>list.get(i+1))
                return false;
        }
        return true;
    }
    private static void search(TreeNode node, List<Integer> list){
        if(node != null){
            search(node.left, list);
            list.add(node.val);
            search(node.right, list);
        }
    }
}
