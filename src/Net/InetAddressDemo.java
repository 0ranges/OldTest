package Net;

import java.net.InetAddress;

/**
 * Created by user on 2017/5/17.
 */
public class InetAddressDemo {
    public static void main(String[] args) throws Exception{
        InetAddress locAdd = InetAddress.getLocalHost();
        InetAddress remAdd = InetAddress.getByName("www.baidu.com");
        System.out.println(locAdd.getHostAddress());
        System.out.println(remAdd.getHostAddress());
        System.out.println(locAdd.isReachable(5000));
    }
}
