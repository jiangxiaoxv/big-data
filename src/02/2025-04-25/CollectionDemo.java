import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static  void main(String[] args) {
        Collection<String> c = new ArrayList<String>();

        c.add("abd");
        c.add("bfd");
        c.add("jxx");
        c.add("jnw");
        c.add("lqq");
        System.out.println(c);
        c.remove("abd");
        System.out.println(c.contains("jxx"));
        System.out.println(c.size());
//        c.clear();
        System.out.println(c);
        System.out.println(c.isEmpty());

        Object[] os = c.toArray();
        String[] ostr = c.toArray(new String[0]);
//        System.out.println(ostr);
//        String[] ss = (String[]) c.toArray();

//        for (Object object : os) {
//            System.out.println(object);
//        }
//        for (String str : ostr) {
//            System.out.println(str);
//        }
    }
}