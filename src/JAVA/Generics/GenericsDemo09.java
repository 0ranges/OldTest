package JAVA.Generics;

/**
 * Created by user on 2017/3/25.
 */
public class GenericsDemo09 {
    public static void main(String args[]){
        add(123,"asf");
        Info1<String> info1 = new Info1<>();
        Info1<Integer> info2 = new Info1<>();
        info1.setVar("123");
        info2.setVar(123);
        //add1(info1,info2);
    }
    public static <T> void add(T a,T b){
        System.out.print(a+"  "+b);
    }
    public static <T> void add1(Info1<T> a,Info1<T> b){
        System.out.print(a.getVar()+"  "+b.getVar());
    }
}
class Info1<T>{
    private T var;

    public T getVar() {
        return var;
    }

    public void setVar(T var) {
        this.var = var;
    }
}
