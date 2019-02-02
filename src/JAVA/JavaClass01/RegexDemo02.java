package JAVA.JavaClass01;

import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * Created by user on 2017/3/29.
 */
public class RegexDemo02 {
    public static void main(String args[]){
        String str = "A1B22C333D4444E55555F";
        String str1 = "1996-11-02";
        Pattern pat = Pattern.compile("\\d+");
        String a[] = pat.split(str);
        for(int i = 0;i<a.length;i++){
            System.out.print(a[i]+"\t");
        }
        System.out.println();
        System.out.println(pat.matcher(str).replaceAll("_"));
        System.out.println(str.replaceAll("\\d+","_"));
        System.out.println(str1.matches("\\d{4}-\\d{2}-\\d{2}"));
        System.out.println(Arrays.toString(str.split("\\d+")));
    }
}
