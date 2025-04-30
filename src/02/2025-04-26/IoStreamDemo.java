import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IoStreamDemo {

    // throws IOException
    public static void main(String[] args)  {

        // 如果文件没有的话会创建
        // 有文件的话直接被覆盖
//        FileWriter writer = new FileWriter("./src/02/2025-04-27/readme.md");

        // 写入数据
        // 数据是先写到缓冲区中，缓冲区满了之后在写到文件中
        // 数据还在缓冲区中，没来得及写到文件中，程序就结束了，这样是写入不成功的
        // 数据是被覆盖的
        // 冲刷缓冲区, 把数据写入进去
//        writer.flush();
        // 关闭流对象，在关流之前，会自动做一次冲刷缓冲区的操作，以防数据在缓冲区，不能被写入
//        writer.close();
        // 为了释放内存
//        writer = null;


        /**
         * jdk1.7之前处理
         */
        FileWriter writer = null;
        try {
            writer = new FileWriter("./src/02/2025-04-27/readme.md");
            writer.write("abc");
            // 为了防止关流失败，自动冲刷缓冲区
            writer.flush();

//            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
//            writer.close(); // writer初始化可能会失败；当new的时候路径不存在
            // 判断流对象是否初始化成功
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    writer = null;
                }
            }
//            writer = null;
        }


        /**
         * JDK1.7之后
         */
        // 这种方式，在执行完成之后会自动关流
        //
        try (FileWriter writer2 = new FileWriter("./src/02/2025-04-27/readme.md");) {
            writer2.write("abcdefghi");
            writer2.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 输入流没有缓冲区
        try {
            FileReader reader = new FileReader("./src/02/2025-04-27/readme.md");
            // 读取数据，返回值表示的是这个数据的编码
            //  int i = reader.read();
            // 定义变量来记录每次读取的字符
//            int i = -1;
//            while ((i = reader.read()) != -1) {
//                System.out.println((char) i);
//            }
//            reader.close();
            char[] cs = new char[7];
            // 判断是否读到了末尾，返回-1
            // 缓冲区不会新建，元素读取的过程中会被一个一个的覆盖；未覆盖的，会在在最后一次打印出
//            while(reader.read(cs) != -1) {
//                System.out.println(new String(cs));
//            }

            int len = -1;
            while((len = reader.read(cs)) != -1) {
                System.out.println(new String(cs, 0 , len));
            }



        }catch (Exception e) {
            e.printStackTrace();
        }

        /**/
    }


    public void copyFile(String path) {
        try {
            FileReader reader = new FileReader(path);
            FileWriter writer = new FileWriter(path);

            int len = -1;
            char[] buffer = new char[10];
            while ((len = reader.read(buffer)) != -1) {
//                writer.write(new String(buffer, 0, len));
                writer.write(buffer, 0, len);
            }

            reader.close();
            writer.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}