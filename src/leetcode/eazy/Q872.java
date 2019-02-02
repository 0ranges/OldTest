package leetcode.eazy;

import leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 2018/8/15.
 */
public class Q872 {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1= new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        addNode(root1,list1);
        addNode(root2,list2);
        if(list1.size() != list2.size())
            return false;
        else{
            int n = list1.size();
            for(int i = 0;i < n;i++){
                if(list1.get(i) != list2.get(i))
                    return false;
            }
            return true;
        }
    }
    public void addNode(TreeNode root,List<Integer> list){
        if(root != null) {
            if (root.right == null && root.left == null)
                list.add(root.val);
            else{
                addNode(root.left,list);
                addNode(root.right,list);
            }
        }
    }
}
