package JVM.OOM;

/**
 * Created by user on 2017/6/14.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * VM Args:-XX:PermSize=10M -XX:MaxPermSize=10M
 * @author pqc
 */
public class RuntimeConstantPoolOOM {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        int i = 0;
        while (true){
            list.add(String.valueOf(i++).intern());
            System.out.println(list.get(i-1));
        }
    }
}
