package test;

import leetcode.BinaryTree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * Created by user on 2018/8/1.
 */
public class test01 {
    public static void main(String[] args) throws Exception  {

//        String s1 = "Programming";
//        String s2 = new String("Programming");
//        String s3 = "Program";
//        String s4 = "ming";
//        String s5 = "Program" + "ming";
//        String s6 = s3 + s4;
//        System.out.println(s1 == s2);
//        System.out.println(s1 == s5);
//        System.out.println(s1 == s6);
//        System.out.println(s1 == s6.intern());
//        System.out.println(s2 == s2.intern());
//        swap(new Test(2),new Test(2));

//        father father = new father();
//        System.out.println("123");
//        son son = new son();
//        System.out.println("123");
//        son son1 = new son();
//
//        test01.C c = new test01().new C();
//        test01.C1 c1 = new test01.C1();

//        System.out.println(39 ^ 39);
        try {
            try {
                throw new Sneeze();
            } catch (Annoyance a) {
                System.out.println("Caught Annoyance");
                throw a;
            }
        } catch (Sneeze s) {
            System.out.println("Caught Sneeze");
            return;
        } finally {
            System.out.println("Hello World!");
        }
    }

    class C{}
    static class C1{}
    public static void swap(Test a){
        return ;
    }

    public static int swap(Test a,Test b) {
        Test temp = a;
        a = b;
        b = temp;
        return 0;
    }

}
class Annoyance extends Exception {}
class Sneeze extends Annoyance {}
interface A{
    void swap();
    int a = 1;
}

class B implements A{

    @Override
    public void swap() {
    }
}
class Test{
    public Test(int a){
        this.a = a;
    }
    int a;
}
class father{
    static {
        System.out.println(1);
    }
    public father(){
        System.out.println(2);
    }
    public father(int i){
        System.out.println(i);
    }
}
class son extends father {
    static {
        System.out.println(3);
    }
    public son() {
        super(5);
        System.out.println(4);
    }
}