package Shixun;

/**
 * Created by user on 2017/9/6.
 */
public class RandomDemo {
    public static void main(String[] args) {
        int count[] = new int[20];
        double a;
        for(int i = 0;i<10000;i++){
            a = Math.random();
            if(a<0.05)
                count[0]++;
            else if(a<0.10)
                count[1]++;
            else if(a<0.15)
                count[2]++;
            else if(a<0.20)
                count[3]++;
            else if(a<0.25)
                count[4]++;
            else if(a<0.30)
                count[5]++;
            else if(a<0.35)
                count[6]++;
            else if(a<0.40)
                count[7]++;
            else if(a<0.45)
                count[8]++;
            else if(a<0.50)
                count[9]++;
            else if(a<0.55)
                count[10]++;
            else if(a<0.60)
                count[11]++;
            else if(a<0.65)
                count[12]++;
            else if(a<0.70)
                count[13]++;
            else if(a<0.75)
                count[14]++;
            else if(a<0.80)
                count[15]++;
            else if(a<0.85)
                count[16]++;
            else if(a<0.90)
                count[17]++;
            else if(a<0.95)
                count[18]++;
            else
                count[19]++;
        }
        for(int i = 0;i<20;i++)
            System.out.println(count[i]);
    }
}
