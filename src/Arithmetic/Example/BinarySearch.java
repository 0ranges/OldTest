package Arithmetic.Example;

/**
 * Created by user on 2017/5/15.
 */

/**
 * 二分查找
 */
public class BinarySearch {
    public static void main(String[] args) {
        int a[] = {1,2,3,5,8,44,66,321,948,1645,4945,16514,156164};
        int key = 345;
        System.out.println(rank(key,a));
    }
    public static int rank(int key,int a[]){
        int low = 0;
        int high = a.length-1;
        while (high>=low){
            int mid = (low+high)/2;
            if(key>a[mid]){
                low = mid+1;
            }else if (key<a[mid]){
                high = mid-1;
            }else
                return mid;
        }
        return -1;
    }
}
