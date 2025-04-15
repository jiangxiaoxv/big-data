
public class J2025_4_10_class {
    public static vodi main(String[] args) {
        Cat c = new Cat();
        // 通过继承使用
    }
}


// 父类/超累/基类
class Pet {
    String type; // 品种
    String name;

    public Pet(String type) {

    }
    public void eat(String food) {
        System.out.println("吃了很多东西" + food);
    }
}

class Cat extends  Pet {

    public Cat() {
        // 如果父类只提供了含参构造，那么这个时候子类的构造方法中就必须提供对应形式的super（参数）
        // super();
        super("ss");
    }


    @Override;
    public void eat(String food) {
        super.eat(food);
    }
}

class Dog extends  Pet{

}