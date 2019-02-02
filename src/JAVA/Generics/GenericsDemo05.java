package JAVA.Generics;

/**
 * Created by user on 2017/3/25.
 */
public class GenericsDemo05 {
    public static void main(String args[]){
        Info01<Number> info01 = new Info01<>();
        Info01<Object> info011 = new Info01<>();
        info01.setVar(123);
        info011.setVar(new Object());
        fun(info01);
        fun(info011);
    }
    public static void fun(Info01<? super Integer> info){
        System.out.print(info.getVar());
    }
}
class Info01<T>{
    private T var;

    public T getVar() {
        return var;
    }

    public void setVar(T var) {
        this.var = var;
    }
}

