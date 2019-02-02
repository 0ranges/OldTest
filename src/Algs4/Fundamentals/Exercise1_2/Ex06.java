package Algs4.Fundamentals.Exercise1_2;

/**
 * Created by user on 2017/11/23.
 */
public class Ex06 {
    //my method
    public static boolean isCircular(String s,String t){
        int n = s.length();
        s = s+s;
        for(int i = 0;i<n;i++){
            if(s.substring(i,i+n).equals(t))
                return true;
        }
        return false;
    }
    //others method
    public static boolean isCircular02(String s,String t){
        return s.length() == t.length()&&s.concat(s).contains(t);
        //return s.length() == t.length()&&s.concat(s).indexOf(t)>=0;
    }
    public static void main(String[] args) {
        System.out.println(isCircular("ACTGACG","TGACGAC"));
        System.out.println(isCircular02("ACTGACG","TGACGAC"));
    }
}
