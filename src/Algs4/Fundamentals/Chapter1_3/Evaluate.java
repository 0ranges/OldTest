package Algs4.Fundamentals.Chapter1_3;

import java.util.Scanner;

/**
 * Created by user on 2017/11/25.
 */
public class Evaluate {
    public static void main(String[] args) {
        Stack<String> ops = new Stack<>();
        Stack<Double> vals = new Stack<>();
        Scanner input = new Scanner(System.in);
        while (input.hasNext()){
            String s = input.next();
            if (s.equals("z"))
                break;
            if(s.equals("(")){
                ;
            }else if(s.equals("+")){
                ops.push(s);
            }else if(s.equals("-")){
                ops.push(s);
            }else if(s.equals("*")){
                ops.push(s);
            }else if(s.equals("/")){
                ops.push(s);
            }else if(s.equals("sqrt")){
                ops.push(s);
            }else if(s.equals(")")){
                String op = ops.pop();
                double v= vals.pop();
                if(op.equals("+")){
                    v = vals.pop()+v;
                }else if(op.equals("-")){
                    v = vals.pop()-v;
                }else if(op.equals("*")){
                    v = vals.pop()*v;
                }else if(op.equals("/")) {
                    v = vals.pop() / v;
                }else if (op.equals("sqrt")) {
                    v = Math.sqrt(v);
                }
                vals.push(v);
            }else {
                vals.push(Double.parseDouble(s));
            }
        }
        System.out.println(vals.pop());
    }
}
