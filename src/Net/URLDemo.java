package Net;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

/**
 * Created by user on 2017/5/18.
 */
public class URLDemo {
    public static void main(String[] args) throws Exception{
        URL url = new URL("http","www.baidu.com",80,"/curriculum.htm");
        url = new URL("http://www.hao123.com/?1495075946");
        InputStream is = url.openStream();
//        Scanner scan = new Scanner(is);
//        while (scan.hasNextLine()){
//            System.out.println(scan.nextLine());
//        }

        URLConnection urlConnection = url.openConnection();
        System.out.println(urlConnection.getContentLength());
        System.out.println(urlConnection.getContentType());
    }
}
