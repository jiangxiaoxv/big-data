import java.util.*;

public class SetDemo {
    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();
        list.add(2);
        list.add(1);
        list.add(5);

        Collections.sort(list);


        List<String> list2 = new LinkedList<>();
        list2.add("Grace");
        list2.add("Alex");
        list2.add("Alice");

        Collections.sort(list2);
        Collections.reverse(list2);
        // 传入一个比较器，
        Collections.sort(list2, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                return o1.charAt(0) - o2.charAt(2);
            }
        });

        Collections.sort(list2, (s1, s2) -> s1.charAt(0)- s2.charAt(0));


        Iterator<String> itt = list2.listIterator();

        while(itt.hasNext()) {
            String str = itt.next();
//            System.out.println(itt.next());
            itt.remove(); // 并不改变原list2对象

            // 在迭代过程中，不允许原集合进行移除
//            list2.remove(str);

        }

        System.out.println(list);
    }

}