package leetcode.hard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by user on 2018/2/27.
 */
public class Q315 {
    //此方法时间复杂度为O(n^2),太大
    public List<Integer> countSmaller01(int[] nums) {
        int n = nums.length;
        List<Integer> result = new ArrayList<>();
        for(int i = 0;i<n-1;i++){
            int sum = 0;
            for(int j = i+1;j<n;j++){
                if(nums[i]>nums[j])
                    sum++;
            }
            result.add(sum);
        }
        if(n > 0)
            result.add(0);
        return result;
    }
    //BST解法
    public List<Integer> countSmaller02(int[] nums){
        List<Integer> res = new ArrayList<>();
        if(nums == null || nums.length == 0) return res;
        TreeNode root = new TreeNode(nums[nums.length - 1]);
        res.add(0);
        for(int i = nums.length - 2; i >= 0; i--) {
            int count = insertNode(root, nums[i]);
            res.add(count);
        }
        Collections.reverse(res);
        return res;
    }
    public int insertNode(TreeNode root,int val){
        int thisCount = 0;
        while(true){
            if(val<=root.val){
                root.count++;
                if(root.left == null) {
                    root.left = new TreeNode(val);
                    break;
                }else
                    root = root.left;
            }else{
                thisCount += root.count;
                if(root.right == null){
                    root.right = new TreeNode(val);
                    break;
                }else
                    root = root.right;
            }
        }
        return thisCount;
    }
    class TreeNode{
        TreeNode left;
        TreeNode right;
        int val;
        int count = 1;
        public TreeNode(int val){
            this.val = val;
        }
    }
}
