package leetcode.eazy;

import leetcode.TreeNode;

/**
 * Created by user on 2018/8/14.
 */
public class Q226 {
    public TreeNode invertTree(TreeNode root) {
        method(root);
        return root;
    }
    public void method(TreeNode root){
        if(root != null) {
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
            method(root.left);
            method(root.right);
        }
    }
}
