import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPReceiverDemo {
    public static void main(String[] args) {

        try {
            DatagramSocket ds = new DatagramSocket(8090);
            // 准备数据包
            DatagramPacket dp = new DatagramPacket(new byte[1024], 1024);
            ds.receive(dp);
            ds.close();

            // 将数据从数据包中解析出来
            byte[] bs = dp.getData();
            int len = dp.getLength();
            System.out.println(new String(bs, 0, len));


            System.out.println("haha");
            // 获取发送过来主机的地址
            System.out.println(dp.getAddress());;


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}