public class StringDemo {
    public static void main(String[] args) {
        String s1 = "ab"; // 指向常量池
        String s2 = new String("ab"); // 指向堆内存地址,堆内存指向常量池

        // “a” 和 "b"是两个字面量
        // 两个字面量在运算的时候为了提高效率，在编译的时候会自动进行自动的计算优化
        // byte b = 3 + 5; -> byte b = 8;
        String s3 = "a" + "b";

        // 字符串在使用 + 拼接的时候底层实际上是调用了StringBuilder中的append方法
        String s4 = "a";
        s4 = s4 + "b"; // 等价于 s4 = new StringBuilder(s4).append("b").toString(); s4 = new String("ab");

        System.out.println(s1 == s2); // false
         System.out.println(s1.equals(s2)); // true
        System.out.println(s1 == s3); // true
        System.out.println(s1 == s4); // false

    }
}
