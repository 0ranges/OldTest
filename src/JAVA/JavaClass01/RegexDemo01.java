package JAVA.JavaClass01;

import java.util.regex.Pattern;

/**
 * Created by user on 2017/3/29.
 */
public class RegexDemo01 {
    public static void main(String args[]){
        String str = "1996-11-02";
        String pat = "\\d{4}-\\d{2}-\\d{2}";
        if(Pattern.compile(pat).matcher(str).matches()){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
