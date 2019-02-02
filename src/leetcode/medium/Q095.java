package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 2018/4/1.
 */
public class Q095 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public List<TreeNode> generateTrees(int n) {
            if(n == 0)
                return new ArrayList<>();
        return divide(1,n);
    }
    public List<TreeNode> divide(int start,int end){
        if(start > end){
            List<TreeNode> list = new ArrayList<>();
            list.add(null);
            return list;
        }
        List<TreeNode> list = new ArrayList<>();
        for(int i = start;i<=end;i++){
            for(TreeNode node_left:divide(start,i-1)){
                for(TreeNode node_right:divide(i+1,end)){
                    TreeNode root = new TreeNode(i);
                    root.left = node_left;
                    root.right = node_right;
                    list.add(root);
                }
            }
        }
        return list;
    }
}
