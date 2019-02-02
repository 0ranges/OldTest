package JAVA.Generics;

/**
 * Created by user on 2017/3/25.
 */
public class GenericsDemo08 {
    public static void main(String args[]){
        Var<Integer> var = getVar(123);
        System.out.print(var.getVar());
    }
    public static <T> Var<T> getVar(T abc){
        Var<T> var = new Var<T>();
        var.setVar(abc);
        return var;
    }
}
class Var<T>{
    private T var;

    public T getVar() {
        return var;
    }

    public void setVar(T var) {
        this.var = var;
    }
    public String toString(){
        return this.var.toString();
    }
}
