package Net;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by user on 2017/5/18.
 */
public class HelloServer {
    public static void main(String[] args) throws Exception{
        ServerSocket server = new ServerSocket(8888);
        System.out.println("等待连接······");
        Socket client = server.accept();
        String str = "hello";
        PrintStream out = new PrintStream(client.getOutputStream());
        out.println(str);
        out.close();
        client.close();
        server.close();
    }
}
