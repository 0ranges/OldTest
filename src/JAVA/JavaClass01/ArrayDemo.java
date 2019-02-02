package JAVA.JavaClass01;

import java.util.Arrays;

/**
 * Created by user on 2017/3/29.
 */
public class ArrayDemo {
    public static void main(String args[]){
        int temp[] = {1,2,3,4,5,6,9,8,7,6,22,4,1,232,41};
        Arrays.sort(temp);
        System.out.println("排序后："+Arrays.toString(temp));
        int x = Arrays.binarySearch(temp,4);
        System.out.println("4的位置："+x);
        Arrays.fill(temp,3);
        System.out.println("填充后："+Arrays.toString(temp));
    }
}
