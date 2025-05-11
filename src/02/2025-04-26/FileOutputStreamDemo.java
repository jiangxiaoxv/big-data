import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamDemo {

    // throws IOException
    public static void main(String[] args) {
        try {
            FileInputStream in = new FileInputStream("./src/02/2025-04-29/readme.md");
            byte[] bs = new byte[10];

            // 定义一个变量记录每次读取的字节的个数
            int len = -1;
            while ((len = in.read(bs)) != -1){
                System.out.println(new String(bs, 0, len));
            }

            FileOutputStream out = new FileOutputStream("./src/02/2025-04-29/readme.md");

            // 写出“abc”
            // 字节流没有缓冲区
            out.write("jxx".getBytes());
            // 释放文件
            out.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void copyFileExe(String path) {
       try {
           long begin = System.currentTimeMillis();
           FileInputStream in = new FileInputStream(path);
           FileOutputStream out = new FileOutputStream(path);


           // 10M
           byte[] bs = new byte[1024 * 1024 * 10];
           int len = -1;
           while ((len = in.read(bs)) != -1) {
               out.write(bs, 0, len);
           }
           in.close();
           out.close();

           long end = System.currentTimeMillis();
           System.out.println("消耗时间:" + (end - begin));
       } catch (Exception e) {
           e.printStackTrace();
       }

    }
}