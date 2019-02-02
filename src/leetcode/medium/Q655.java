package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 2018/8/15.
 */
public class Q655 {
    public List<List<String>> printTree(TreeNode root) {
        int n = depth(root);
        List<List<String>> res = new ArrayList<>();
        int m = (int)Math.pow(2,n) - 1;
        for(int i = 0 ; i < n;i++){
            List<String> list = new ArrayList<>();
            for(int j = 0;j < m;j++){
                list.add("");
            }
            res.add(list);
        }
        print(root,0,m-1,0,res);
        return res;
    }
    public int depth(TreeNode root){
        if(root == null){
            return 0;
        }else{
            return Math.max(depth(root.left),depth(root.right)) + 1;
        }
    }
    public void print(TreeNode root,int lo,int hi,int n,List<List<String>> res){
        if(root != null){
            int mid = lo + (hi - lo) / 2;
            res.get(n).set(mid,"" + root.val);
            print(root.left,lo,mid-1,n+1,res);
            print(root.right,mid+1,hi,n+1,res);
        }
    }
}
