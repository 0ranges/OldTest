package Arithmetic.Exercise;

/**
 * Created by user on 2017/5/22.
 */

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * 超时了
 *
 *
 * Description
 Kevin是一个数学天才，Lda一直立志于出一道数学难题难住Kevin，但是Kevin实在太强，很多次尝试都失败了。

 终于有一天，Lda发现了一个很难的问题：求n个数的最小公倍数。因为即使是n个较小的数，他们的最小公倍数也可以很大很大，实在是很难计算。Lda相信这样一个问题一定能难住Kevin.

 但是Lda的数学知识有限，他只会计算n个互素的数的最小公倍数。为了能验证Kevin的答案是否正确，Lda必须把题目中的数出成两两互素的。Lda已经找到了一些求最小公倍数的题目，但有些题中的数并不互素。Lda希望能够从这些题目中删掉一些数，使余下的数两两互素。但是考虑到Kevin的数学能力实在很强，Lda希望删掉这些数后最终的答案不能减小，否则就难不住Kevin了。例如，原题是求4, 6, 9的最小公倍数，Lda可以把6删掉，这样题目中剩下的数4, 9是互素的，同时答案仍然是36没有减小。

 当然，有的题目根本就找不到这样的删改方法，也有一些题目有很多符合条件的删改方法。Lda想请教你，这些求最小公倍数的题目到底有多少种删改方法，既让所有数互素，又不减小最终的答案(若不须删改或者最后剩一个数恰好等于最小公倍数也算一种)。

 Input
 第一行一个正整数T(T<=20)，表示Lda已经找到的题目数量。接下来有T道求最小公倍数的题，每道题由两行组成，第一行一个整数n(1<=n<=200),第二行n个不相同的整数m1,m2…mn(2<=mi<=1016)，表示原题是要求这n个数的最小公倍数。

 Output
 对于每一道题，输出一行：这个题有多少种删改方案符合Lda的要求。如果删改方案多于1000种则不需输出具体的数量，只需输出“MORE THAN 1000” (不含引号)

 Sample Input
 4
 3
 4 6 9
 2
 12 18
 3
 3 5 15
 4
 10 15 14 21
 Sample Output
 1
 0
 2
 2
 */
public class Exercise12 {
    public static  int count = 0;
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        Vector<Integer> vector = new Vector<>();
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 0;i<n;i++) {
            int x = input.nextInt();
            vector.clear();
            for (int j = 0; j < x; j++) {
                int y = input.nextInt();
                vector.add(y);
            }
            count = 0;
            search(vector,max_max(vector));
            v.add(count);
        }
        for(int c:v){
            System.out.println(c);
        }
    }
    public static int max_max(Vector<Integer> vector){
        int n = 1;
        for(int a:vector){
            n = n*a/max(n,a);
        }
        return n;
    }
    public static void search(Vector<Integer> vector,int n ){
        int a = isValid(vector);
        if(a == -1){
            if(max_max(vector)==n)
                count++;
        }else {
            int x = a / vector.size();
            int y = a % vector.size();
            int xx = vector.get(x);
            int yy = vector.get(y);

            vector.remove(x);
            search(vector, n);
            vector.add(x,xx);
            
            vector.remove(y);
            search(vector, n);
            vector.add(y, yy);
        }
    }
    public static int isValid(Vector<Integer> vector){
        for(int i = 0;i<vector.size();i++){
            for(int j = i+1;j<vector.size();j++){
                if(max(vector.get(i),vector.get(j))!=1){
                    return vector.size()*i+j;
                }
            }
        }
        return -1;
    }
    public static int max(int a,int b){

            while (a != b) {
                if (a > b)
                    a = a - b;
                else
                    b = b - a;
            }
            return a;
    }
}
