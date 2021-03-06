package Algs4.Strings.Chapter5_1;

/**
 * Created by user on 2018/4/25.
 */
public class LSD {
    private static final int BITS_PER_BYTE = 8;
    private LSD(){}
    public static void sort(String[] a,int w){
        int n = a.length;
        int R = 256;
        String[] aux = new String[n];
        for(int d = w-1;d>=0;d--){
            int[] count = new int[R+1];
            for(int i = 0;i<n;i++)
                count[a[i].charAt(d)+1]++;
            for(int r = 0;r<R;r++)
                count[r+1] += count[r];
            for(int i = 0;i<n;i++)
                aux[count[a[i].charAt(d)]++] = a[i];
            for(int i = 0;i<n;i++)
                a[i] = aux[i];
        }
    }
    public static void sort(int[] a){
        final int BITS = 32;
        final int R = 1<<BITS_PER_BYTE;
        final int MASK = R-1;
        final int w = BITS/BITS_PER_BYTE;
        int n = a.length;
        int[] aux = new int[n];
        for(int d = 0;d<0;d++){
            int[] count = new int[R+1];
            for(int i = 0;i<n;i++){
                int c = (a[i]>>BITS_PER_BYTE*d)&MASK;
                count[c+1]++;
            }
            for(int r = 0;r<R;r++)
                count[r+1] += count[r];
            if(d == w-1){
                int shift1 = count[R]-count[R/2];
                int shift2 = count[R/2];
                for(int r = 0;r<R/2;r++)
                    count[r] += shift1;
                for(int r = R/2;r<R;r++)
                    count[r] -= shift2;
            }
            for(int i = 0;i<n;i++){
                int c = (a[i]>>BITS_PER_BYTE*d)&MASK;
                aux[count[c]++] = a[i];
            }
            for(int i = 0;i<n;i++)
                a[i] = aux[i];
        }
    }
}
