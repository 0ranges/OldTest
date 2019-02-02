package leetcode.medium;


import java.util.LinkedList;
import java.util.Queue;

/**
 * @author : oranges
 * @date : 2018/8/29 16:24
 */
public class Q513 {
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int num = 1;
        int numB = 0;
        int res = root.val;
        while(num > 0){
            for(int i = 0;i < num;i++){
                TreeNode node = queue.poll();
                if(node.left != null){
                    numB++;
                    queue.offer(node.left);
                    if(numB == 1){
                        res = node.left.val;
                    }
                }
                if(node.right != null) {
                    numB++;
                    queue.offer(node.right);
                    if(numB == 1){
                        res = node.right.val;
                    }
                }
            }
            num = numB;
            numB = 0;
        }
        return res;
    }
}
