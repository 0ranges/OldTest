package DesignPatterns.TemplateMethod;

/**
 * Created by user on 2017/4/11.
 */
public class TemplateMethodDemo {
    public static void main(String args[]){
        String exp = "8+8";
        AbstractClass cal = new PlusDemo();
        int result = cal.calculate(exp, "\\+");
        System.out.println(result);
    }
}
abstract class AbstractClass{
    public final int calculate(String exp,String opt){
        int array[] = split(exp,opt);
        return calculate(array[0],array[1]);
    }
    abstract public int calculate(int num1,int num2);
    public int[] split(String exp,String opt){
        String array[] = exp.split(opt);
        int arrayInt[] = new int[2];
        arrayInt[0] = Integer.parseInt(array[0]);
        arrayInt[1] = Integer.parseInt(array[1]);
        return arrayInt;
    }
}
class PlusDemo extends AbstractClass{
    public int calculate(int num1,int num2){
        return num1+num2;
    }
}