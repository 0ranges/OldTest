package JAVA.JavaClass;

/**
 * Created by user on 2017/3/28.
 */
public class SystemTest {
    public static void main(String args[]){
        //System.exit(0);
        System.out.println("213");
        Runtime runtime = Runtime.getRuntime();
        System.out.println("剩余内存："+runtime.freeMemory());
        long x = System.currentTimeMillis();
        String A = "";
        for(int i = 0;i<1000;i++){
            A += i;
        }
        long y = System.currentTimeMillis();
        System.out.println("耗时："+(y-x)+"毫秒");
        System.out.println("剩余内存："+runtime.freeMemory());
        System.gc();
        System.out.println("剩余内存："+runtime.freeMemory());
    }
}
