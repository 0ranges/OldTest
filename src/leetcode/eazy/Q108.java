package leetcode.eazy;

import leetcode.TreeNode;

/**
 * Created by user on 2018/8/10.
 */
public class Q108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return divide(nums,0,nums.length-1);
    }
    public TreeNode divide(int[] num,int lo,int hi){
        if(lo == hi)
            return new TreeNode(num[lo]);
        else if(lo > hi)
            return null;
        else{
            int mid = (lo + hi + 1)/2;
            TreeNode root = new TreeNode(num[mid]);
            root.left = divide(num,lo,mid-1);
            root.right = divide(num,mid+1,hi);
            return root;
        }
    }
}
