import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class BufferedReaderDemo {

    // throws IOException
    public static void main(String[] args) {
        try {
//            FileReader fileReader = new FileReader("./src/02/2025-04-27/readme.md");
//            BufferedReader reader = new BufferedReader(fileReader);

            // 读取一行
//            String str = reader.readLine();

//            String str = null;
//            while ((str = reader.readLine()) != null) {
//                System.out.println(str);
//            }


            // 关流
            // 只需要关闭最外层的流就好，那么这个时候底层会自动关闭里层的流
//            reader.close();

            int line = computedCodeLine("./src/02/2025-04-27");
            System.out.println("java代码行数：" + line);

//            System.out.println(reader.readLine());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 统计代码行数
    public static int computedCodeLine(String path) {
        int i = 0;

        try {
            File file = new File(path);

            if (file.isDirectory()) {
                File[] fs = file.listFiles();
                for (File f : fs) {
                    i += computedCodeLine(f.getAbsolutePath());
                }

            } else if(file.getName().endsWith(".java")) {
                FileReader fileReader = new FileReader(file);
                BufferedReader reader = new BufferedReader(fileReader);
                while (reader.readLine() != null) {
                    i++;
                }
                reader.close();
            }



        } catch (Exception e) {
            e.printStackTrace();;
        }


        return i;
    }
}