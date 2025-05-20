//import java.io.*;
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Vector;
//
//public class  s implements Serializable {
//
//    // 版本号
//    @Serial
//    private static final long serialVersionUID = 563L;
//    public String name;
//    // transient 标识该属性不能被序列化
//    private transient double weight;
//    public int age;
//
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//
//
//    public static void main(String[] args) {
//        System.out.println("s");
//
//        s s1 = new s();
//        s1.setAge(1);
//        s1.setName("姜南晚");
//
//        try {
//            // 创建一个序列化对象
//            // ObjectOutputStream 将对象转化为字节数组
//            // FileOutPutStream 将字节数组写到文件中
//            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("./p.data"));
//            out.writeObject(s1);
//
//            out.close();
//
//            // 反序列化
//            // 创建反序列化对象
//            // FileInputStream读取文件，读取到一个字节数组
//            // ObjectInputStream 将字节数组转化为对象
//            ObjectInputStream in = new ObjectInputStream(new FileInputStream("./p.data"));
//            s sin = (s) in.readObject();
//
//            // 关流
//            in.close();
//
//            System.out.println(sin.getName());
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static void ss() {
////        List<s> slist = new ArrayList<>();
////        List<s> slist = new LinkedList<>();
////        List<s> slist = new Vector<>();
//
//    }
//}