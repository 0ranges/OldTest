package JAVA.JavaClass;

/**
 * Created by user on 2017/3/27.
 */
public class StringBufferDemo02 {
    public static void main(String args[]){
        StringBuffer buf = new StringBuffer();
        buf.append("hello world!!");
        if(buf.indexOf("hello") == -1){
            System.out.println("no hava");
        }
        else{
            System.out.println("have");
        }

    }
}
