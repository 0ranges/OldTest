package leetcode.BinaryTree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 2018/3/27.
 */
//二叉树的前序遍历
public class T001 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        print(list,root);
        return list;
    }
    public void print(List<Integer> list,TreeNode root){
        if(root != null) {
            list.add(root.val);
            print(list,root.left);
            print(list,root.right);
        }
    }
}
