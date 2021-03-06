package leetcode.eazy;

import Algs4.Fundamentals.Chapter1_3.Queue;

/**
 * Created by user on 2018/4/1.
 */
public class Q104 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        return Math.max(maxDepth(root.left)+1,maxDepth(root.right)+1);
    }
}
