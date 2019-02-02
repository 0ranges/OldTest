package JVM.OOM;

/**
 * Created by user on 2017/6/8.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * VM Args:-Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 * @author pqc
 */
public class HeapOOM {
    public static void main(String[] args) {
        List<OOM> list = new ArrayList<>();
        while (true){
            list.add(new OOM());
        }
    }
    static class OOM{

    }
}
