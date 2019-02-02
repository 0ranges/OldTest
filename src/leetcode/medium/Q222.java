package leetcode.medium;

/**
 * Created by user on 2017/9/3.
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
public class Q222 {
    public int countNodes(TreeNode root) {
        int num = 1;
        if(root == null)
            return 0;
        int count = 0;
        TreeNode oldRoot = root;
        while(root.left!=null){
            count++;
            root = root.left;
        }
        root = oldRoot;
        if(isSame(root)){
            return (int)Math.pow(2,count+1)-1;
        }
        else{
            root = oldRoot;
            for(int i = 0;i<count;i++){
                if(root.left!=null&&root.right==null)
                    return num*=2;
                if(isSame(root.left)&&isSame(root.right)){
                    root = root.left;
                    while(root.right!=null){
                        root = root.right;
                        num = num*2+1;
                    }
                }
                if(!isSame(root.left)){
                    root = root.left;
                    num = num*2;
                }else{
                    root = root.right;
                    num = num*2+1;
                }
            }
            return num;
        }
    }
    public boolean isSame(TreeNode root){
        int countLeft = 0;
        int countRight = 0;
        TreeNode oldRoot = root;
        while(root.left!=null){
            countLeft++;
            root = root.left;
        }
        root = oldRoot;
        while(root.right!=null){
            countRight++;
            root = root.right;
        }
        return countLeft == countRight;
    }
}
