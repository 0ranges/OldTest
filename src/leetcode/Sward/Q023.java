package leetcode.Sward;

import leetcode.TreeNode;

/**
 * @author : oranges
 * @title : leetcode.Sward
 * @date : 2019/3/2 21:07
 * @description :
 *
 * 二叉树的镜像
 */
public class Q023 {
    public void Mirror(TreeNode root) {
        if (root == null) {
            return;
        }
        swap(root);
        Mirror(root.right);
        Mirror(root.left);
    }

    private void swap(TreeNode root) {
        TreeNode t = root.left;
        root.left = root.right;
        root.right = t;
    }
}
