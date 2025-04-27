import java.util.ArrayList;

import java.util.List;
public class TypeDemo {
    public static void main(String[] args) {
        // 底层是以Object形式存储对象
        List list = new ArrayList<>();
        list.add("abc");
        list.add(2);


        List<String> list2 = new ArrayList<>();

        Demo<String> d = new Demo<>();


        // 如果使用?定义一个结合，那么这个集合不能再添加元素
        List<?> list3;
        list3 = new ArrayList<String>();
//        list3.add("abc");





    }
}

// 泛型类
// 泛型的命名和标识符一样
/**
 *
 * @param <T>
 *     T  type
 *     E  element
 *     K  key
 *     V  value
 *     R  return/result
 */
class Demo<T> {
    T t;

    public  void set(T t) {
        this.t = t;
    }

    public <E> void m(E e) {}

    // 泛型的上边界，所能传入的最大元素类型就是Number

    public <E extends Number> void num(List<E> list) {}

    // 传入元素类型是String及其父类的列表
    // ？ super 类/接口 表示传入类/接口及其父类/父接口对象
    // 所能传入的最小类型是String，规定泛型的下限
    // ？ 表示类型通配符
    public static void print(List<? super String> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }
}