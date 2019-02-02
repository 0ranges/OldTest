package JAVA.IOTest;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by user on 2017/4/12.
 */
public class ScannerDemo01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("输入日期（yyyy-MM-dd）：");
        String str = null;
        Date date = null;
        if(input.hasNext("^\\d{4}-\\d{2}-\\d{2}$")){
            str = input.next("^\\d{4}-\\d{2}-\\d{2}$");
            try{
                date = new SimpleDateFormat("yyyy-MM-dd").parse(str);
            }catch (Exception e){
                e.printStackTrace();
            }
        }else{
            System.out.println("输入日期格式不正确。");
        }
        System.out.println(date);
    }
}
