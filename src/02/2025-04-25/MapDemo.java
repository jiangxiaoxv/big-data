import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// 表示静态导入
import static java.util.Arrays.sort;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>();

        map.put("hed", 3.85);
        map.put("nbs", 3.85);

        Double d = map.get("hed");
        boolean b = map.containsKey("hed");
        boolean bv = map.containsValue(3.86);

//        map.remove("hed");
//        map.clear();

//        Iterator i = map.entrySet().iterator();
//        while (i.hasNext()) {
//            Map.Entry<String, Double> me = (Map.Entry<String, Double>) i.next();
//            System.out.println(me.getKey());
//            System.out.println(me.getValue());
//        }

        Set<String> keys = map.keySet();

//        for(String key: keys) {
//            System.out.println(map.get(key));
//        }

        Set<Map.Entry<String, Double>> entries = map.entrySet();

        for (Map.Entry<String , Double> e : entries ) {
            System.out.println(e.getKey() + ":" +e.getValue());
        }

        System.out.println(map);
    }
}