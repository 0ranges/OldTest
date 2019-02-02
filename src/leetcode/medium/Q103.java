package leetcode.medium;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * Created by user on 2018/8/8.
 */
public class Q103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null)
            return res;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        int index = 1;
        int next_index = 0;
        List<Integer> list = new ArrayList<>();
        boolean flag = false;
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            if(flag)
                list.add(0,node.val);
            else
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
                flag = !flag;
                index = next_index;
                next_index = 0;
                res.add(list);
                list = new ArrayList<>();
            }

        }
        return res;
    }
}
