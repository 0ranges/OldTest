package leetcode.medium;


import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by user on 2018/4/3.
 */
public class Q662 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node = root;
        for(int i = 2;i<33;i++){
            node.right = new TreeNode(i);
            node = node.right;
        }
        System.out.println(widthOfBinaryTree(root));
    }
    public static int widthOfBinaryTree(TreeNode root) {
        HashMap<TreeNode,Integer> map = new HashMap<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        map.put(root,1);
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            if(node.left != null){
                queue.add(node.left);
                map.put(node.left,2*map.get(node));
            }
            if(node.right != null){
                queue.add(node.right);
                map.put(node.right,2*map.get(node)+1);
            }
        }
        Integer[] index = map.values().toArray(new Integer[map.size()]);
        Arrays.sort(index);
        int max = 0;
        int n = 0;
        int a = 1;
        int i = 0;
        while (i<index.length){
            if(index[i]>a){
                a = a*2+1;
                max = index[i-1]-index[n]+1>max? index[i-1]-index[n]+1:max;
                n = i;
            }
            i++;
        }
        max =  index[i-1]-index[n]+1>max? index[i-1]-index[n]+1:max;
        return max;
    }
    public int widthOfBinaryTree02(TreeNode root) {
        if(root == null){
            return 0;
        }
        Queue<TreeNode> queue =  new LinkedList<>();  //用于树的广度优先遍历。
        Queue<Integer> queuePos =  new LinkedList<>(); //用于保存上面队列中树节点对应的位置标号。
        queue.add(root);
        queuePos.add(1);//在顶层跟结点位置为1.

        int countCurrent  = 1;//记录正在遍历的当前层次的剩余数量。
        int countTmp = 0; //记录下一层次结点的数量。
        int max = countCurrent; //记录最大的差距。（目标）（与start 和 end相关）
        int start = 1;//记录某层次结点的最左边的结点。
        int end = 1;//记录某层次结点的最右边的结点。

        while(!queue.isEmpty()){

            TreeNode current = queue.poll();
            end = queuePos.poll();

            if(current.left != null){
                queue.add(current.left);
                queuePos.add(2*end);//分配左孩子结点的序号。
                countTmp ++;//记录下层结点的数量
            }
            if(current.right != null){
                queue.add(current.right);
                queuePos.add(2*end +1); //分配右孩子结点的序号
                countTmp ++;
            }

            //当前层次已遍历完毕，计算max,并且为下一层次的遍历准备。
            if(--countCurrent == 0){
                // 目标比对。
                if(max < end - start + 1){
                    max = end - start +1;
                }
                countCurrent = countTmp;//设置下一层次剩余的数量
                countTmp = 0;
                //设置下一层结点的start.
                start = queuePos.isEmpty() ?  1 : queuePos.peek();
            }
        }
        return max;
    }
}
