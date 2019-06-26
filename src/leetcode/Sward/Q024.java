package leetcode.Sward;

import leetcode.TreeNode;

/**
 * @author : oranges
 * @title : leetcode.Sward
 * @date : 2019/3/2 21:28
 * @description :
 *
 * 对称的二叉树
 */
public class Q024 {

    public boolean isSymmetrical(TreeNode pRoot) {
        if (pRoot == null) {
            return true;
        }
        return isSymmetrical(pRoot.right, pRoot.left);
    }

    boolean isSymmetrical(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return true;
        }
        if (t1 == null || t2 == null) {
            return false;
        }
        if (t1.val != t2.val) {
            return false;
        }
        return isSymmetrical(t1.left, t2.right) && isSymmetrical(t1.right, t2.left);
    }

}
