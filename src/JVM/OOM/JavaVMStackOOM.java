package JVM.OOM;

/**
 * Created by user on 2017/6/14.
 */

/**
 * VM Args:-Xss2M
 * @author pqc
 */
public class JavaVMStackOOM {
    private void dontStop(){
        while (true){

        }
    }
    public void stackLeakByThread(){
        while (true){
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    dontStop();
                }
            });
            thread.start();
        }
    }

    public static void main(String[] args) throws Throwable{
        JavaVMStackOOM oom = new JavaVMStackOOM();
        oom.stackLeakByThread();
    }
}
