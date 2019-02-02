package Shixun;

/**
 * Created by user on 2017/9/6.
 */
public class StringDemo {
    public static void main(String[] args) {
        String str = new String();
        str = "abc";
        System.out.println(str);
        StringBuffer sb = new StringBuffer("abc");
        sb.append("123" +
                "123" +
                "123" +
                "123" +
                "123" +
                "123" +
                "123" +
                "123" +
                "123");
        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.length());


        StringBuffer sb1 = new StringBuffer("abc");
        StringBuffer sb2 = new StringBuffer("abc");
        System.out.println(sb1.equals(sb2));
        System.out.println(sb1.toString().equals(sb2.toString()));
    }
}
