
//package page.cn;
import java.util.Scanner;
//这是第一个类
public class Demo {
    /*
     * 多行注释
     * 程序执行的入口
     * */
    public static void main(String[] args) {
//        String s = "";
//        int i = 6;
//        int j ;
//        j = 600_111_111;
//        double jj = 9.5;
//        float ff = 0.3f
//        long l = 5L;
//        double d = 4e4; // aeb a * 10^b
//        double dd = 0x5p3; // 表示十六进制的科学技术法 xpy 表示 x * 2^y
//        char c = 'a';
//        char c2 = '4';
//        char c3 = '\u2398' // ?

//        System.out.println("hello world", d);
        Scanner s = new Scanner(System.in);
//        double d = s.nextDouble();
//        String str = s.nextLine();

        int i = s.nextInt();
//        if （i % 3 == 0) {
//            System.out.println("haha");
//        } else {s
//            System.out.println("啥也不是");
//        }
        switch (i) {
            case 3: System.out.println('w'); break;
            case 2: System.out.println('r');
        }
    }
}

//class TypeChangeDemo {
//    public  static  void main(String[] args){
//        byte b = 5;
//        int i = b;
//        System.out.println(i)
//    }
//}