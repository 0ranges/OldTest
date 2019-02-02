package JAVA.IOTest;

/**
 * Created by user on 2017/4/3.
 */
public class SystemDemo01 {
    public static void main(String args[]){
        try{
            System.out.print(Integer.parseInt("hello"));
        }catch (Exception e){
            System.err.print(e);
        }
    }
}
