package leetcode.medium;

/**
 * Created by user on 2018/8/6.
 */
public class Q230 {
    public int kthSmallest(TreeNode root, int k) {
        int left = size(root.left);
        if(left + 1 == k)
            return root.val;
        else if(left + 1 < k)
            return kthSmallest(root.right,k-1-left);
        else
            return kthSmallest(root.left,k);
    }
    public int size(TreeNode root){
        if(root == null)
            return 0;
        else
            return 1 + size(root.left) +size(root.right);
    }
}
