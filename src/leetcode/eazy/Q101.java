package leetcode.eazy;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * Created by user on 2017/9/19.
 */
public class Q101 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        return isMirror(root.left,root.right);
    }
    public boolean isMirror(TreeNode p, TreeNode q) {
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        return (p.val==q.val) && isMirror(p.left,q.right) && isMirror(p.right,q.left);
    }
}
