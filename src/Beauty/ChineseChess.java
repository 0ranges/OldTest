package Beauty;

/**
 * Created by user on 2017/6/11.
 */
public class ChineseChess {
    public static void main(String[] args) {
        method1();
        method2();
    }
    static class I{
        public char a;
        public char b;
    }
    static void method1(){
        byte c = 81;
        while (c-->0){
            if(c%9%3==c/9%3)
                continue;
            System.out.printf("A=%d,B=%d\n",c/9+1,c%9+1);
        }
    }
    static void method2(){
        I i = new I();
        for(i.a = 1;i.a<=9;i.a++){
            for(i.b=1;i.b<=9;i.b++){
                if(i.a%3 != i.b%3)
                    System.out.printf("A=%d,B=%d\n",(int)i.a,(int)i.b);
            }
        }
    }
}
