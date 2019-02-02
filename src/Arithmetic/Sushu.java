package Arithmetic;

/**
 * Created by user on 2017/4/15.
 */
/*
* 问题描述：找出3位数对称素数
* 如101就是，787也是，896不是
* 是的话输入YES，否则输出NO
* xtfggef 2012/5/16
*/
public class Sushu {
    public static void main(String[] args) {
        for(int i = 100;i<999;i++){
            if(i/100 == i%10&&isPrime(i)){
                System.out.print(i+"\t");
            }
        }
    }
    public static boolean isPrime(int n){
        for(int i = 2;i<=n/2;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
}
