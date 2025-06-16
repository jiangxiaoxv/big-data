import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerDemo {
    public static void main(String[] args) {
        // 创建服务器端的套接字对象
        ServerSocket serverSocket = null;

        try {
            ServerSocket ss = new ServerSocket(8085);
            // 接收连接, 会产生阻塞
            Socket s = ss.accept();

            InputStream in = s.getInputStream();
            //  读取数据
            byte[] buf = new byte[1024];
            int len = in.read(buf);
            while (len != -1) {
                System.out.println(new String(buf, 0, len));
                // 会产生阻塞
                len = in.read(buf);
            }
            // 通知客户端数据读取完毕
            s.shutdownInput();
            ss.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}