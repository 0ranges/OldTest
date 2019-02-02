package JAVA.JavaClass;

/**
 * Created by user on 2017/3/27.
 */
public class StringBufferDemo {
    public static void main(String args[]){
        StringBuffer sb = new StringBuffer();
        sb.append("hello");
        sb.append("\n");
        sb.append("world!!");
        System.out.println(sb);

        String str = "123";
        Add(str);
        System.out.println(str);

        StringBuffer buf = new StringBuffer();
        buf.append("123");
        Add1(buf);
        System.out.print(buf);
    }
    public static void Add(String str){
        str = str + "456";
    }
    public static void Add1(StringBuffer str){
        str.append("456");
    }
}
