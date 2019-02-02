package JAVA.JavaClass01;

import java.util.regex.Pattern;

/**
 * Created by user on 2017/3/29.
 */
public class RegexDemo {
    public static void main(String args[]){
        String abc = "1234123411";
        if(Pattern.compile("[0-9]+").matcher(abc).matches()){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
