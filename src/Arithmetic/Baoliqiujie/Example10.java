package Arithmetic.Baoliqiujie;

/**
 * Created by user on 2017/5/5.
 */
/*
八皇后问题
回溯法
success
 */
public class Example10 {
    public static int kind = 0;
    public static void main(String[] args) {
        int n = 8;
        int a[] = new int[n];
        search(0,n,a);
        System.out.println(kind);
    }
    public static void search(int index,int n,int[] a) {

        if(index == n)
            kind++;
        else for(int i = 0;i<n;i++){
            a[index] = i;
            boolean ok = true;
            for(int j = 0;j<index;j++){
                if(a[index]==a[j]||j+a[j]==index+a[index]||index-a[index]==j-a[j]){
                    ok = false;
                    break;
                }
            }
            if(ok){
                search(index+1,n,a);
            }
        }
    }
}
