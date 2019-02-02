package leetcode.eazy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 2018/4/2.
 */
public class Q257 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public List<String> binaryTreePaths(TreeNode root) {
        if(root == null)
            return new ArrayList<>();
        if(root.right == null && root.left == null){
            List<String> list = new ArrayList<>();
            list.add(""+root.val);
            return list;
        }
        List<String> list = new ArrayList<>();
        if(root.left == null&&root.right != null) {
            for (String s : binaryTreePaths(root.right)) {
                String str = root.val + "->" + s;
                list.add(str);
            }
        }
        else if(root.right == null&&root.left != null) {
            for (String s : binaryTreePaths(root.left)) {
                String str = root.val + "->" + s;
                list.add(str);
            }
        }else{
            for (String s : binaryTreePaths(root.left)) {
                String str = root.val + "->" + s;
                list.add(str);
            }
            for (String s : binaryTreePaths(root.right)) {
                String str = root.val + "->" + s;
                list.add(str);
            }
        }
        return list;
    }
}
