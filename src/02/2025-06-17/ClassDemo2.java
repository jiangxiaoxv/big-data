import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ClassDemo2 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

       /* Class<Object> clz = (Class<Object>) Class.forName("java.lang.Object");

        // 产生Object对象
        Object o = clz.newInstance();
        System.out.println("开始了吗");
        System.out.println(o);

        Class<String> clz1 = (Class<String>) Class.forName("java.lang.String");
        String s = clz1.newInstance(); // 无参，类必须提供无参构造

        *//*Class<Integer> clz2 = (Class<Integer>) Class.forName("java.lang.Integer");
        Integer i = clz2.newInstance("12");
        System.out.println(i);*//*

        Class<Integer> clz2 = (Class<Integer>) Class.forName("java.lang.Integer");
        // 获取类中的构造方法, 获取Integer（int）
        Constructor<Integer> c = clz2.getConstructor(int.class);
        // 执行构造方法，创建对应类的对象
        Integer in = c.newInstance(12);
        // Integer in = new Integer(5);
        System.out.println(in);



        Class<String> clz3 = (Class<String>) Class.forName("java.lang.String");
        String s2 = clz3.newInstance();
        Constructor<String> c2 = clz3.getConstructor(String.class); // 获取那个构造函数
        String s3 = c2.newInstance("abc");
        System.out.println(s3);*/

        // getConstructor 只能获取public的构造方法
//        Constructor<String> c3 = clz3.getConstructor(char[].class, boolean.class);

        Class<String> clz3 = (Class<String>) Class.forName("java.lang.String");
        // 获取这个类的构造方法（不区分权限修饰符）
        Constructor<String> c4 = clz3.getDeclaredConstructor(char[].class, boolean.class);
        c4.setAccessible(true); //  暴力破解、拆除
        String c5 = c4.newInstance(new char[]{'a', 'b'}, true);
        System.out.println(c5.toString());


        // 获取所有的构造方法
        Constructor[] cs = clz3.getConstructors();
        for (Constructor c : cs) {
//            System.out.println(c.getName());
//            System.out.println(c);
        }

        // 获取指定的方法
        Method m = clz3.getDeclaredMethod("charAt", int.class);
        m.setAccessible(true);
        String str = "abcdefg";
//        System.out.println(m.invoke(clz3, 2));

        System.out.println(m.invoke(str, 2));

        Method m1 = clz3.getDeclaredMethod("length");
        int len = (int)m1.invoke(str);
        System.out.println(len);


        Method m2 = clz3.getDeclaredMethod("indexOfSupplementary", int.class, int.class);
        m2.setAccessible(true);
        int i = (int)m2.invoke(str, 1, 5);
        System.out.println(i);
    }
}