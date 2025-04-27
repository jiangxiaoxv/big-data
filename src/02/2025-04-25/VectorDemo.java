import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        Vector<String> v2 = new Vector<>(5, 3);
//        System.out.println(v.capacity());

        v.add("a");
        v.add("b");
//        v.remove("b");
        Enumeration<String> e = v.elements();

        while(e.hasMoreElements()) {
            String str = e.nextElement();
            System.out.println(str);
            // 在迭代过程中，不建议增删原集合
            v.remove(str);
        }

    }
}