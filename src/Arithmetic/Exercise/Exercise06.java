package Arithmetic.Exercise;

    import java.util.Scanner;

/**
 * Created by user on 2017/4/30.
 */
/*
 UC Browser

 Description
Brother Xi has recently bought a smart mobile phone. Now he surfs Internet by his mobile phone almost every day. The browser that he uses is UC Browser, which is one of the most popular mobile browsers. To better grasp the users, UC Corporation have also brought out the level system of user account. The higher the level of your account, the more privileges you can enjoy. The level of your account is calculated by your experiences. The correspondence of level and experience is as follows:

Level	Experiences	Level	Experiences	Level	Experiences
0	0-49	3	250-349	6	550-649
1	50-149	4	350-449	7	650-749
2	150-249	5	450-549	8	>=750
You can get 10 experiences after using UC Browser one day in a row, 20 experiences for two days in a row, 30 experiences for three days in a row, 40 experiences for four days in a row, 50 experiences for five days in a row. If you use UC Browser six days in a row, the experiences you can get will be equal 10, like your using UC Browser one day in a row. It's come back to the starting of your using UC Browser. It's a circle.

Now you have known the Xi's record of using UC Browser, I'll hope you calculate the level of Xi's account.

Input
The first line of the input contains a single integer T (0<T<120) which is the number of test cases, followed by 2*T lines. For each test case, the first line is the number of days n (0<n<=100), the second line is a series of 0 and 1. 0 stands for not using UC browser on that day and 1 stands for using UC browser on that day.

Output
For each test case, output the corresponding level of Xi’s account in one line.

Sample Input
2
6
110101
12
111111110101
Sample Output
1
2
 */
public class Exercise06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String need[] = new String[n];
        for(int i = 0;i<n;i++){
            int a = input.nextInt();
            need[i] = input.next();
        }
        for(String str:need){
            char c[] = str.toCharArray();
            int index = 0;
            int experience = 0;
            for(char c1:c){
                if(c1 == '1'){
                    index ++;
                    if(index == 6){
                        index = index -5;
                    }
                    experience += index*10;
                }else {
                    index = 0;
                }
            }
            int level = 0;
            if(experience>=750){
                level = 8;
            }else {
                level = (experience+50)/100;
            }
            System.out.printf("%d\n",level);
        }
    }
}
