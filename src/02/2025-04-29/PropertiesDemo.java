import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.util.Properties;

public class PropertiesDemo  implements Serializable {
    public static void main(String[] args) {
        Properties prop = new Properties();

        // 添加
        prop.setProperty("name", "jxx");
        prop.setProperty("age", "15");
        prop.setProperty("lover", "香香");

        // 持久化这个映射
        // Properties 对象只能放到properties文件中
        // 第二个参数标识向这个Properties 文件添加注释
        try {
//            prop.store(new FileOutputStream("./p1.properties"),null);
            prop.store(new FileOutputStream("./p1.properties"),"this is a person");

            Properties prop1 = new Properties();
            prop1.load(new FileInputStream("./p1.properties"));
            System.out.println(prop1.getProperty("lover"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

