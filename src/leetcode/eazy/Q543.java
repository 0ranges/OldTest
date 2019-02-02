package leetcode.eazy;

/**
 * Created by user on 2018/4/19.
 */
public class Q543 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null)
            return 0;
        return Math.max(Math.max(diameterOfBinaryTree(root.left),diameterOfBinaryTree(root.right)),maxRoot(root));
    }
    public int maxRoot(TreeNode root){
        if(root == null)
            return 0;
        return  max(root.right)+max(root.left);
    }
    public int max(TreeNode root){
        if(root == null)
            return 0;
        return Math.max(max(root.left),max(root.right))+1;
    }
}
