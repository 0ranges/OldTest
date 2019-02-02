package JAVA.Generics;

/**
 * Created by user on 2017/3/25.
 */
public class GenericsDemo06 {
    public static void main(String args[]){
        InfoImpl<String> info = new Info06<>("234");
        System.out.print(info.getVar());
    }
}
interface InfoImpl<T>{
    public T getVar();
}
class Info06<T> implements InfoImpl{
    private T var;
    public Info06(T var){
        this.var = var;
    }
    public T getVar(){
        return var;
    }
    public void setVar(T var){
        this.var = var;
    }
}
