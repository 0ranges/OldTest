package Arithmetic.Exercise;

/**
 * Created by user on 2017/5/16.
 */

import java.util.Scanner;
import java.util.Vector;

/**
 * Description
 Yucept21和他的室友Zyn因为宿舍没电去网吧上网，上了27分钟，Cs打电话来说来电了。所以Yucept21在第29分钟下机了，上网的费用是一块钱，然后Zyn墨迹了两分钟，第31分钟下机，上机费用是2元。现在知道网吧是按照半个小时计费的，假设半个小时上机的费用是1块钱。现在给你两个时间点，要你求出上机费用和再上多少分钟最划算？（最划算是指上满这个三十分钟，比如上机一个小时四十五分钟，那么再上v = 15分钟最划算）。

 Input
 输入为一行四个数字，上机时间h1,m1,下机时间h2,m2。 h是小时，m是分钟,采用24小时制。0<=h1,h2<=23

 0<=m1,m2<60

 Output
 输出Day #: 后面两个数字w和v，w为费用，v描述如上，单位分钟。如果上机时间在下机时间的后面则输出"Joking"。

 Sample Input
 1 48 3 39
 20 16 22 6
 23 8 1 42
 Sample Output
 Day 1: 4 9
 Day 2: 4 10
 Day 3: Joking
 */
public class Exercise08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Vector<String> vector = new Vector<>();
        int m = 0;
        int count = 0;
        int left = 0;
        while (input.hasNextInt()){
            int h1 = input.nextInt();
            int m1 = input.nextInt();
            int h2 = input.nextInt();
            int m2 = input.nextInt();

            if(h2<h1||(h1==h2&&m2<m1)){
                vector.add("Joking");
            }else{
                m = h2*60 + m2 - h1*60 - m1;
                count = m/30+1;
                left = count * 30 - m;
                vector.add(count+" "+left);
            }
        }
        for(String str:vector){
            System.out.println(str);
        }
    }
}
