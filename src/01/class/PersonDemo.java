//package cn.tedu.object;

public class PersonDemo {
    public static void main(String[] args){
        Person p = new Person();
        p.age = 18;
        p.eat('龙虾');

        Student s = new Student("hh", 12);
        s.name = "素素";
        s.study();

        // 定义在方法中的代码块，称之为局部代码块
        {
            // 限制了变量的使用范围和生命周期
            // 内存会提前释放，以提高栈内存的利用率
            int j = 1;
            System.out.println(j)
        }
    }
}

class Person {
    // 特征 --- 属性
    // 成员变量
    String name; // 姓名
    int age; // 年龄
    char gender;
    double height;
    double weight;

    public void eat(String food) {
        System.out.println(food)
    }


}

class Baby {
    String name;


    // 构造代码块 / 初始化代码块
    // 无论哪个构造方法执行，都会依次执行
    {
        this.cry();
        this.eat();
    }

    public  Baby() {
    }

    public Baby(String name) {
        this.name = name;
        this();
    }

    public void cry() {
        System.out.println("哭");
    }

    public void eat() {
        System.out.println("吃");
    }
}

class Student {
    String name; // 姓名
    int age;
    String no;
    char gender;
    // 与类同名，没有返回值, 构造方法可以重载
    Student(){}

    // @SuppressWarnings --- 用于压制警告
    Student(String n, int a) {
        this.name = n;
        this.age = a;
    }

    Student(String name, int age, char gender, String id) {
        this(name, id);
        this.age = age;
        this.gender = gender;
        this.no = id;
    }
    public void study() {}
}