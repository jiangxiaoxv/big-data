
import java.util.Objects;


//package src;
public class ObjectDemo1 implements Cloneable {
    int i;
    public static void main(String[] args) throws Exception {
        ObjectDemo1 od1 = new ObjectDemo1();
        od1.i = 10;
        // 一个类所产生的对象要想被克隆，那么这个类必须要实现Cloneable接口
        // Cloneable 接口中每一偶任何的方法和属性，仅仅作为一个标志
        /**
         * Object.clone()
         */
        ObjectDemo1 od2 = (ObjectDemo1) od1.clone();
//        System.out.println("好神奇的" );
//        System.out.println(od2.i == od1.i);

        Person2 p = new Person2();
        // p.clone(); //该方法不能被访问
        // 并不是直接调用gc，而是通知gc进行回收
        // 对GC仅仅起的是通知作用，gc不一定启动
        // od1.finalize();
        System.gc();


        /**
         * Object.getClass()
         */
        Object o = "abc";
        // 获取对象的实际类型
        // System.out.println(o.getClass());

        /**
         * Object.hashCode()
         */
        Object o1 = new Object();
        //哈希码根据哈希散列来计算出来的
        // 哈希散列算法要求计算出来的值随机的散落在int的取值范围内
        // 如果两个对象相等，那么这两个对象的哈希码一定相同
//        System.out.println(o1.hashCode());


        /**
         * Object.toString()
         */
        System.out.println(o1);
        System.out.println(o1.toString());


        /**
         * Object.equal()
         */
        Person2 p1 =  new Person2();
        p1.setName("Rose");

        Person2 p2 = new Person2();
        p2.setName("Rose");
        // 底层用的是===进行比较 ， == 默认比较的是地址
        System.out.println(p1.equals(null));
        System.out.println(p1.equals(p2));
//        System.out.println(null == null);
        /**
         *
         */

    }

}

class Person2 implements Cloneable {
    private String name;
    private int age;
    private char gender;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//
//        // 判断参数是否为null
//        if (obj == null) {
//            return false;
//        }
//
//        // 比较类型
//        if  (this.getClass() != obj.getClass()) {
//            return false;
//        }
//
//
//        Person2 p = (Person2) obj;
//        // 比较属性, name是String，是引用
//        if (this.name == null) {
//            return p.name == null;
//        }else return this.name.equals(p.name);
//
////        return super.equals(obj);
//    }


    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Person2 person2 = (Person2) object;
        return age == person2.age && gender == person2.gender && Objects.equals(name, person2.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender);
    }
}