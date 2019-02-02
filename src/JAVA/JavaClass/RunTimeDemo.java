package JAVA.JavaClass;


/**
 * Created by user on 2017/3/27.
 */
public class RunTimeDemo {
    public static void main(String args[]){
        Runtime run = Runtime.getRuntime();
        System.out.println("JVM最大内存量："+run.maxMemory());
        System.out.println("JVM空闲内存量："+run.freeMemory());
        String str = "";
        for(int i = 0;i<1000;i++){
            str += i;
        }
        System.out.println("JVM剩余空闲内存量："+run.freeMemory());
        run.gc();
        System.out.println("回收之后，JVM空闲内存量："+run.freeMemory());
        System.out.println("JVM空闲内存量："+run.freeMemory());
        StringBuffer str1 = new StringBuffer();
        for(int i = 0;i<1000;i++){
            str1.append(i);
        }
        System.out.println("JVM剩余空闲内存量："+run.freeMemory());
        System.out.println("JVM空闲内存量："+run.freeMemory());
        String str2 = "";
        for(int i = 0;i<100000;i++){
            str2 += i;
        }
        System.out.println("JVM剩余空闲内存量："+run.freeMemory());
    }
}
