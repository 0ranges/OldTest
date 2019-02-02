package JAVA.JavaClass;

/**
 * Created by user on 2017/3/27.
 */
public class RuntimeDemo01 {
    public static void main(String args[]){
        Runtime run = Runtime.getRuntime();
        Process pro = null;
        try{
            pro = run.exec("notepad.exe");
        }catch (Exception e){
            e.printStackTrace();
        }
        try{
            Thread.sleep(5000);
        }catch (Exception e){
            e.printStackTrace();
        }
        //pro.destroy();
    }
}
