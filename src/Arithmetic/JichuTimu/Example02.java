package Arithmetic.JichuTimu;

import java.util.Scanner;

/**
 * Created by user on 2017/4/19.
 */
/*
Tex括号
在TeX中，做双引号为“，右双引号为”。
输入一片包含双引号的文章，转换为TeX格式
例子：
输入："To be or not to be,"quoth the Bard,"that is a question".
输出：“To be or not to be,”quoth the Bard,“that is a question”.
 */
public class Example02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        char c[] = str.toCharArray();
        boolean flag = true;
        for(int i = 0;i<c.length;i++){
            if(c[i] == '"') {
                System.out.printf("%s", flag ? "“" : "”");
                flag = !flag;
            }  else {
                System.out.printf("%s",c[i]);
            }
        }
    }
}
