import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class TcpClientDemo {
    public static void main(String[] args) {
        Socket socket = null;
        socket = new Socket();

        // 发起连接
        try {
            // 阻塞
            socket.connect(new InetSocketAddress("localhost", 8085));
            // 获取socket自带的输出流
            OutputStream os = socket.getOutputStream();
            // 会产生阻塞
            os.write("你好，服务器端~~~".getBytes());
            socket.shutdownInput();;// 告诉服务器端数据已经写出完毕
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}