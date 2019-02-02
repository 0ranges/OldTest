package Arithmetic;

/**
 * Created by user on 2018/3/8.
 */
/*
 *根据前序遍历中序遍历数组求树
 */
public class test01 {
    static class TreeNode{
        public int val;
        public TreeNode left;
        public TreeNode right;
        public TreeNode(int val){
            this.val = val;
        }
    }
    public static TreeNode method(int[] pre,int[] med){
        return devide(0,pre.length-1,pre,0,med.length-1,med);
    }
    public static TreeNode devide(int lo_1,int hi_1,int[] pre,int lo_2,int hi_2,int[] med){
        if(lo_1>hi_1||lo_2>hi_2)
            return null;
        int index = 0;
        for(int i = lo_2;i<=hi_2;i++){
            if(med[i] == pre[lo_1]) {
                index = i;
                break;
            }
        }
        TreeNode root = new TreeNode(pre[lo_1]);
        root.left = devide(lo_1+1,lo_1+index-lo_2,pre,lo_2,index-1,med);
        root.right = devide(lo_1+index-lo_2+1,hi_1,pre,index+1,hi_2,med);
        return root;
    }

    public static void main(String[] args) {
        int[] med = {3,7,2,6,4,1,0,19,9,5};
        int[] pre = {6,7,3,2,9,1,4,0,19,5};
        TreeNode root = method(pre,med);
        prePrint(root);
        System.out.println();
        medPrint(root);
    }
    public static void medPrint(TreeNode root){
        if(root.left!=null)
            medPrint(root.left);
        System.out.print(root.val+" ");
        if(root.right!=null)
            medPrint(root.right);
    }
    public static void prePrint(TreeNode root){
        System.out.print(root.val+" ");
        if(root.left!=null)
            prePrint(root.left);
        if(root.right!=null)
            prePrint(root.right);
    }
}
