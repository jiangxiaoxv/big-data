import java.util.List;

public class ClassDemo1 {
    public static void main(String[] args) throws ClassNotFoundException {
        // Class 是一个代表类的类
        Class clz = ClassDemo1.class;
        Class<String> clz1 = String.class;
//        System.out.println(clz1);

        // clz2 代表list接口的字节码
        Class<List> clz2 = List.class;
//        System.out.println(clz2);

        Class<int[]> clz3 = int[].class;
//        System.out.println(clz3);

        // double的字节码
        Class<double[]> clz4 = double[].class;

//        System.out.println(clz4);

        Object o = "abc";
        Class<Object> clz5 = (Class<Object>) o.getClass();

//        System.out.println(clz5);


        // 升华了
//        Class<String> clz6 = (Class<String>) Class.forName("String");
        Class<String> clz6 = (Class<String>) Class.forName("java.lang.String");

        System.out.println(clz6);

    }
}