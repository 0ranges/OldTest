package leetcode.hard;

/**
 * Created by user on 2018/4/24.
 */
public class Q004 {
    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{1,3,5,6,8,10,12,14,15},new int[]{2,4,9}));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int lo1 = 0,hi1 = nums1.length-1;
        int lo2 = 0,hi2 = nums2.length-1;
        int mid1 = 0,mid2 = 0;
        double res = 0;
        System.gc();
        return res / 2;
    }
}
