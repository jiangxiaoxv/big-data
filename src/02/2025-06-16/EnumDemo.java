import java.util.Enumeration;

public abstract class EnumDemo {

    public static void main(String[] args) {
//        Season s = Season.Spring;
//        System.out.println(s);
//        Season2 s1 = Season2.Spring;
        Season3 s3 = Season3.Spring;
        s3.work();

        switch (s3) {
            case Spring:
                System.out.println("Spring");
                break;
            case Summer:
                System.out.println("Summer");
                break;
            case Autumn:
                System.out.println("Autumn");
                break;
            case Winter:
                System.out.println("Winter");
                break;
        }
        System.out.println("香香");

//        System.out.println(s1);
    }
}

class Season {
    private Season() {
    }

    public static final Season Spring = new Season();
    public static final Season Summer = new Season();
    public static final Season Autumn = new Season();
    public static final Season Winter = new Season();
}

enum Season2 {
    // 枚举中构造方法默认私有化
    // 枚举常量必须定义在枚举类的首行
    Spring, Summer, Autumn, Winter;
    private int[] months;
    private int year;

    // 构造可以被重载
    private Season2() {}
    private Season2(int year) {}

    public void setMonths(int[] months) {
        this.months = months;
    }

    public int[] getMonths() {
        return months;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public static void rain() {
        System.out.println("每个季节都在下雨");
    }

}

enum Season3 {
    // 枚举中构造方法默认私有化
    // 枚举常量必须定义在枚举类的首行
    Spring {
        @Override
        public void work() {
            System.out.println("看妹妹");
        }
    },
    Summer {
        @Override
        public void work() {

        }
    },
    Autumn {
        @Override
        public void work() {

        }
    },
    Winter(2025) {
        @Override
        public void work() {

        }
    };

    private Season3() {}
    private Season3(int year) {}


//    public abstract void snow();
    public abstract void work();
}