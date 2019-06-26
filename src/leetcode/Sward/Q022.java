package leetcode.Sward;

import leetcode.TreeNode;

/**
 * @author : oranges
 * @title : leetcode.Sward
 * @date : 2019/3/2 21:03
 * @description :
 *
 * 树的子结构
 */
public class Q022 {
    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null) {
            return false;
        }
        return isSubtreeWithRoot(root1, root2) || isSubtreeWithRoot(root1.right, root2) || isSubtreeWithRoot(root1.left, root2);
    }

    private boolean isSubtreeWithRoot (TreeNode root1, TreeNode root2) {
        if (root2 == null) {
            return true;
        }
        if (root1 == null) {
            return false;
        }
        if (root1.val != root2.val) {
            return false;
        }
        return isSubtreeWithRoot(root1.left, root2.left) && isSubtreeWithRoot(root1.right, root2.right);
    }
}
