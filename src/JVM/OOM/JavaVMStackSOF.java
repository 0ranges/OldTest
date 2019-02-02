package JVM.OOM;

/**
 * Created by user on 2017/6/14.
 */

/**
 * VM Args: -Xss128k
 * @author pqc
 */
public class JavaVMStackSOF {
    private int stackLength = 1;
    public void stackLeak(){
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) throws Throwable{
        JavaVMStackSOF oom = new JavaVMStackSOF();
        try{
            oom.stackLeak();
        }catch (Throwable t){
            System.out.println("stack length:"+oom.stackLength);
            throw t;
        }
    }
}
