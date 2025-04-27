import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("grace");
        list.add("M6ace");
        list.add("mace");
        list.add("A2ace");

        Stream<String> stream = list.stream();
        // 筛选开头字母为M的字符串
//        stream.filter(new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//
//                return s.startsWith("M");
//            }
//        }).forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });

//        stream.filter(str -> str.startsWith("g")).forEach(str -> {
//            System.out.println(str);
//        });
//        stream.map(new Function<String, String>() {
//            //
//            public String apply(String t) {
//                return t.toUpperCase();
//            }
//        }).forEach(str -> System.out.println(str));

//        Stream<String> sfilter = stream.filter(str -> str.startsWith("A"));
//        System.out.println(sfilter.count());

        Boolean b  = stream.anyMatch(str -> str.startsWith("A"));
//        Boolean a = stream.allMatch(str -> str.startsWith("A"));

        System.out.println(b);




    }
}