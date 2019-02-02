package JAVA.Collection;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by user on 2017/4/22.
 */
public class EnumerationDemo01 {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("B");
        vector.add("A");
        vector.add("C");
        vector.add("D");
        Enumeration<String> enumer = vector.elements();
        while(enumer.hasMoreElements()){
            System.out.printf("%s,",enumer.nextElement());
        }
    }
}
