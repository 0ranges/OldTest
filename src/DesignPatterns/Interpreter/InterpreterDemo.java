package DesignPatterns.Interpreter;

import java.sql.Connection;

/**
 * Created by user on 2017/4/12.
 */
public class InterpreterDemo {
    public static void main(String[] args) {
        // 计算9+2-8的值
        int result = new Minus().interpret(new Context(new Plus().interpret(new Context(9,2)),8));
        System.out.println("9+2-8="+result);
    }
}
interface Expression{
    public int interpret(Context context);
}
class Plus implements Expression{
    public int interpret(Context context){
        return context.getNum1()+context.getNum2();
    }
}
class Minus implements Expression{
    public int interpret(Context context){
        return context.getNum1()-context.getNum2();
    }
}
class Context{
    private int num1;
    private int num2;
    public Context(int num1,int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
}