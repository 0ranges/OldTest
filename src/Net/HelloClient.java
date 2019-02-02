package Net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * Created by user on 2017/5/18.
 */
public class HelloClient {
    public static void main(String[] args) throws Exception{
        Socket client = new Socket("localhost",8888);
        BufferedReader buf = new BufferedReader(new InputStreamReader(client.getInputStream()));
        String str = buf.readLine();
        System.out.println("服务端输出内容："+str);
        client.close();
        buf.close();
    }
}
