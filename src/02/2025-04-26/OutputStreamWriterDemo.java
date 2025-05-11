import java.io.*;
import java.nio.charset.StandardCharsets;

public class OutputStreamWriterDemo {

    // throws IOException
    public static void main(String[] args) {

        try {
            FileOutputStream fos = new FileOutputStream("./src/02/2025-04-29/readme.md");
            // 构建了一个转化流对象
            // 真正写数据是FileOutputStream
            // OutputStreamWriter 是将字符转化为字节
            OutputStreamWriter ow = new OutputStreamWriter(fos, StandardCharsets.UTF_8);

            ow.write("姜晓许");

            ow.close();
            fos.close();


            // 字节转字符
            // 以字节形式读取数据
            // 把读取到的字节转化为字符
            InputStreamReader in = new InputStreamReader(new FileInputStream("./src/02/2025-04-29/readme.md"));
            char[] cs = new char[10];

            int len = in.read(cs);

            System.out.println(new String(cs, 0 , len));
            in.close();





        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}