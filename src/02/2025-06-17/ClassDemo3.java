import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class ClassDemo3 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        Class<String> class1 = (Class<String>) Class.forName("java.lang.String");
        Class<String> clz = (Class<String>) Class.forName("java.lang.String");

        Field f = clz.getDeclaredField("hash");
        f.setAccessible(true);
        String str = "jxx";
        f.set(str, 256);
//        System.out.println(f.get(str));

        Constructor[] cons = clz.getDeclaredConstructors();

        Class<Level> clz1 = Level.class;
        Level[] ls = clz1.getEnumConstants();
        for (Level l : ls) {
//            System.out.println(l);
        }

//        System.out.println(clz.getSuperclass());
//        System.out.println(clz.getName());
//        System.out.println(clz.getSimpleName());
//
        Package pkg = clz.getPackage();
        System.out.println(pkg);
        System.out.println(pkg.getName());

        A a = new A() {};
        System.out.println(a.getClass().isAnonymousClass());
    }
}

class A {}
enum Level {
    First, Second, Third
}
