package Arithmetic.GaoxiaoSheji;

/**
 * Created by user on 2017/5/23.
 */

/**
 * 归并排序
 */
public class Example02 {
    public static void main(String[] args) {
        int a[] = {5,94,65,4,65,6,3,6,4,88,9,46,5550,61,65,656,9,4,61};
        int T[] = new int[a.length];
        merge_sort(a,0,a.length,T);
        for(int q:a)
            System.out.print(q+" ");
    }
    public static void merge_sort(int a[],int x, int y,int T[]){
        if(y-x>1) {
            int m = x + (y - x) / 2;
            int p = x,q = m,i = x;
            merge_sort(a, x, m, T);
            merge_sort(a, m, y, T);
            while (p<m||q<y){
                if(q>=y||(p<m&&a[p]<a[q]))
                    T[i++] = a[p++];
                else
                    T[i++] = a[q++];
            }
            for(i = x;i<y;i++)
                a[i] = T[i];
        }
    }
}
