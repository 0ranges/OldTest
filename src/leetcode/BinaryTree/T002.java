package leetcode.BinaryTree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 2018/3/27.
 */
public class T002 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        print(list,root);
        return list;
    }
    public void print(List<Integer> list,TreeNode root){
        if(root != null) {
            print(list,root.left);
            list.add(root.val);
            print(list,root.right);
        }
    }
}
