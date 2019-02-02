package JAVA.JavaClass;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by user on 2017/3/27.
 */
public class InterDemo {
    public static void main(String args[]){
        Locale znloc = new Locale("zh","CN");
        ResourceBundle rb = ResourceBundle.getBundle("Message",znloc);
        System.out.print(rb.getString("info"));
    }
}