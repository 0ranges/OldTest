package leetcode.eazy;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by user on 2018/4/19.
 */
public class Q100 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p != null && q != null){
            if(p.val != q.val)
                return false;
            else if(p.left == null&&p.right == null&&q.right != null && q.right != null&&p.val == q.val)
                return true;
            else
                return isSameTree(p.right,q.right)&&isSameTree(p.left,q.left);
        }else if(p == null &&q == null)
            return true;
        else
            return false;
    }
}
