package leetcode.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by user on 2018/4/9.
 */
public class Q113 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if(root == null)
            return new ArrayList<>();
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        dfs(lists,root,list,sum);
        return lists;
    }
    public void dfs(List<List<Integer>> lists,TreeNode root,List<Integer> list,int sum){
        list.add(root.val);
        if(root.left!=null){
            dfs(lists,root.left,list,sum);
        }
        if(root.right!=null){
            dfs(lists,root.right,list,sum);
        }
        if(root.left==null&&root.right==null){
            int res = 0;
            for(int i:list)
                res+=i;
            if(res == sum)
                lists.add(new ArrayList<>(list));
        }
        list.remove(list.size()-1);
    }
}
