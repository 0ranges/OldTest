package leetcode.medium;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * Created by user on 2018/8/8.
 */
public class Q102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null)
            return res;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        int index = 1;
        int next_index = 0;
        List<Integer> list = new ArrayList<>();
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            list.add(node.val);
            if(node.left != null){
                queue.add(node.left);
                next_index ++;
            }
            if(node.right != null){
                queue.add(node.right);
                next_index ++;
            }
            if(--index == 0){
                index = next_index;
                next_index = 0;
                res.add(list);
                list = new ArrayList<>();
            }

        }
        return res;
    }
}
