package leetcode.medium;

/**
 * Created by user on 2018/8/21.
 */
public class Q105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        return creatRoot(preorder,0,n - 1,inorder,0,n - 1);
    }
    public TreeNode creatRoot(int[] preorder,int lo_1,int hi_1,int[] inorder,int lo_2,int hi_2){
        if(lo_1 > hi_1)
            return null;
        TreeNode root = new TreeNode(preorder[lo_1]);
        int i = lo_2;
        for(;i <= hi_2;i ++){
            if(inorder[i] == preorder[lo_1])
                break;
        }
        root.left = creatRoot(preorder,lo_1 + 1,lo_1 + i - lo_2,inorder,lo_2,i - 1);
        root.right = creatRoot(preorder,lo_1 + i - lo_2 + 1,hi_1,inorder,i + 1,hi_2);
        return root;
    }
}
