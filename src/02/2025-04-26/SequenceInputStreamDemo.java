import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class SequenceInputStreamDemo {
    public static void main(String[] args) {

        try {
            FileInputStream in1 = new FileInputStream("./src/02/2025-04-27/readme.md");
//            FileInputStream in2 = new FileInputStream("./src/02/2025-04-27/readme.md");
//            FileInputStream in3 = new FileInputStream("./src/02/2025-04-27/readme.md");

            Vector<InputStream> v = new Vector<>();
            v.add(in1);
//            v.add(in2);
//            v.add(in3);

            Enumeration<InputStream> e = v.elements();

            SequenceInputStream sis = new SequenceInputStream(e);

            FileOutputStream out = new FileOutputStream("./src/02/2025-04-29/readme.md");

            // 同一个文件被多个流打开了，gg了
            byte[] bs = new byte[10];
            int len = -1;
            while ((len = sis.read(bs)) != -1) {
                out.write(bs, 0, len);
            }

            out.close();
            sis.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}