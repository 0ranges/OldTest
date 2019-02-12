package leetcode.eazy;

import leetcode.TreeNode;

/**
 * @author : oranges
 * @title : leetcode.eazy
 * @date : 2019/2/12 13:12
 * @description :
 */
public class Q671 {
    public static int min1;
    public static int min2;
    public int findSecondMinimumValue(TreeNode root) {
        if(root == null){
            return -1;
        }
        min1 = Integer.MAX_VALUE;
        min2 = min1;
        search(root);
        return min2 == Integer.MAX_VALUE ? -1 : min2;
    }
    public void search(TreeNode root){
        if(root == null){
            return;
        }else{
            if(root.val < min1){
                min2 = min1;
                min1 = root.val;
            }else if(root.val > min1 && root.val < min2){
                min2 = root.val;
            }
            search(root.right);
            search(root.left);
        }
    }
}
