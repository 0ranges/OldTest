package JAVA.Generics;

/**
 * Created by user on 2017/3/25.
 */
public class GenericsDemo07 {
    public static void main(String args[]){
        String str = getVar("abc");
        System.out.print(str);
    }
    public static <T> T getVar(T var){
        return var;
    }
}
