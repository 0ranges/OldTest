package JAVA.Generics;

/**
 * Created by user on 2017/3/25.
 */
public class GenericsDemo10 {
    public static void main(String args[]){
        Integer[] info = fun(1,2,3,4,5,6,7);
        print(info);
    }
    public static <T> T[] fun(T... args){
        return args;
    }
    public static <T> void print(T p[]){
        for(T a:p){
            System.out.print(a+",");
        }
    }
}
