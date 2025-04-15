
import java.util.*; // 表示导入util包下所有的类，单不包括子包下的类
public class J2025_4_10_class {
    public static vodi main(String[] args) {
        // 通过继承使用
        ArrayUse au = arr -> Arrays.sort(arr);
        // 静态方法的传递
        // ArrayUse au = Arrays::sort;
        int[] arr = {3. 8, 2};
        au.ascSort(arr);

        System.out.println(Arrays.toString(arr));

        Outer1.Inner2 oi2 = new Outer1().new Inner2();
        Outer1.Inner3 oi3 = new Outer1.Inner2();

        // 匿名内部类实际上是实现了对应的接口
        A a = new A() {
            public void m() {

            }
        };
        B b = new B() {
            public void m() {

            }
        };

        C c = new C() {};

    }
}

@FunctionalInterface
interface ArrayUse {
    double ascSort(int[] arr);
}


class Outer1 {
    int i = 10;
    final int j = 11;
    public void m() {
        class Inner1 {
            int i = 10;

            static final  int jj = 10;

            public void m() {
                System.out.println(Outer1.this.i);
                // 要求j是一个常量
                j = 22;
            }
        }

        Inner1 im = new Inner1();

    }

    // 定义在类中的类 --- 成员内部类
    class Inner2 {
        // 不能定义静态方法和静态变量，只能够定义静态常量
        static final  i = 10;
        public void m() {

        }
    }

    static class Inner3 {

    }

}

// 匿名内部类
interface  A {
    void m();
}

abstract B {
    abstract void m();
}

class C {
    // 接口默认是静态的
    static interface  Inner4 {}
}

interface Outer5 {
    // 接口默认是静态的
    class Innert5{}

    // 接口默认是静态的
    interface  Inner6 {}
}



























