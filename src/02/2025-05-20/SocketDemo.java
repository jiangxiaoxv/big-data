import jdk.nashorn.internal.runtime.ECMAException;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class SocketDemo {
    public static void main(String[] args) {
        System.out.println("Hello World");

        InetSocketAddress isa = new InetSocketAddress("localhost", 8090);
        /*InetSocketAddress isa = new InetSocketAddress("localhost", 8080);

        System.out.println(isa.getAddress());
        System.out.println(isa.getPort());
        System.out.println(isa.getHostName());*/

        // 数据包
        DatagramPacket dp = new DatagramPacket("hello~~~".getBytes(), "hello~~~".getBytes().length, isa);
        try {
            // 创建一个udp套接字对象
            DatagramSocket ds = new DatagramSocket();
            ds.send(dp);
            ds.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}