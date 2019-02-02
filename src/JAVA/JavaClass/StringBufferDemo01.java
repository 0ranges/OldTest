package JAVA.JavaClass;

/**
 * Created by user on 2017/3/27.
 */
public class StringBufferDemo01 {
    public static void main(String args[]){
        StringBuffer buf = new StringBuffer();
        buf.append("world");
        buf.insert(0,"hello ");
        buf.insert(buf.length()," !!");
        System.out.println(buf);
        System.out.println(buf.reverse());
        buf.reverse();
        buf.replace(6,11,"abc");
        System.out.println(buf);
        String str = buf.substring(6,9);
        System.out.println(str);
        System.out.println(buf);
        buf.substring(6,9);
        System.out.println(buf);
    }
}
