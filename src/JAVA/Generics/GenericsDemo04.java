package JAVA.Generics;

/**
 * Created by user on 2017/3/25.
 */
public class GenericsDemo04 {
    public static void main(String args[]){
        Info<String> info = new Info<>();
        info.setVar("123");
        fun(info);
    }
    //public static void fun(Info info){
    public static void fun(Info<?> info){
        System.out.print(info.getVar());
    }
}
class Info<T>{
    private T var;

    public T getVar() {
        return var;
    }

    public void setVar(T var) {
        this.var = var;
    }
}
