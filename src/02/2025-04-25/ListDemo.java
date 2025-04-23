import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();

        List<String> list = new ArrayList<String>();
        list.add("dog");
        list.add("jxx");
//        list.add("abt");
//        list.add("lep");

//        list.add(0, "jxx");
//        list.add(4, "66");
//        list.add(5, 2);

//        list.remove("lep");
//        list.remove(2);


        List<String> list2 = new ArrayList<String>();
        list2.add("jxx");
        list2.add("dog");

//        System.out.println(list.equals(list2)); // true

        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
        }
//        System.out.println(list);


//        System.out.println(list.indexOf("lep"));
//        System.out.println(list.lastIndexOf("dog"));
//        System.out.println(list);
        list.set(0, "jnw");
//        System.out.println(list);

        List listsub = list.subList(0, 2);
        System.out.println(listsub);
        System.out.println("s".length());

    }
}