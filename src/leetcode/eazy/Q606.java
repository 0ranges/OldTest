package leetcode.eazy;

/**
 * Created by user on 2017/9/20.
 */
public class Q606 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public String tree2str(TreeNode t) {
        if(t == null)
            return "";
        String str = String.valueOf(t.val);
        if(t.left == null&&t.right == null)
            return str;
        if(t.left != null&&t.right == null)
            return str+"("+tree2str(t.left)+")";
        if(t.left == null&&t.right != null)
            return str+"()("+tree2str(t.right)+")";
        else
            return str+"("+tree2str(t.left)+")"+"("+tree2str(t.right)+")";
    }
}
