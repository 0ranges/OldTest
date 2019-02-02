package leetcode.medium;

/**
 * @author : oranges
 * @date : 2018/8/30 17:36
 */
public class Q814 {
    public TreeNode pruneTree(TreeNode root) {
        if(count(root) == 0){
            return null;
        }
        prune(root);
        return root;
    }
    public void prune(TreeNode root){
        if(count(root.left) == 0){
            root.left = null;
        }else{
            prune(root.left);
        }
        if(count(root.right) == 0){
            root.right = null;
        }else{
            prune(root.right);
        }
    }
    public int count(TreeNode root){
        if(root == null){
            return 0;
        }
        return root.val + count(root.left) + count(root.right);
    }
}
