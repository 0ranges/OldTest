package Net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * Created by user on 2017/5/21.
 */
public class UDPServer {
    public static void main(String[] args) throws Exception{
        DatagramSocket ds = new DatagramSocket(3000);
        String str = "hello world";
        DatagramPacket dp = new DatagramPacket(str.getBytes(),str.length(), InetAddress.getByName("localhost"),9000);
        System.out.println("Send.");
        ds.send(dp);
        ds.close();
    }
}
