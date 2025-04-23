
import java.nio.charset.StandardCharsets;

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
        // 表示从1970-01-01 00:00:00
//        System.currentTimeMillis();

        /**
         * 获取字符串的长度
         */
        String str = "jxx";
        int len = str.length();
        // 获取字符串制定下标的位置
        char c = str.charAt(1);
        // 将字符串转化为字符数组
        char[] cs = str.toCharArray();
        for(char cc : cs) {
            System.out.println(cc);
        }


        /**
         * 将字符数组转化为字符串
         */
        char[] cs2 = {'c', 'e'};
        String str2 = new String(cs2);
        // 只转化一部分
//        String str3 = new String(cs2, offset, count);// offset 下标起始位置， count表示个数
        String str3 = new String(cs2, 0, 2);


        /**
         * compareTo，97， 65； 相差32,区分大小写
         */
        // s1, s2在底层是以字符数组形式存储，在比较的时候，遍历两个字符数组，将字符数组的对应位置上字符进行相减，如果这一位相减为0
        // 则继续遍历，计算下一位，如果这一位相减不为0，那么就将这个相减的差作为结果返回,
        // 如果每一位相减都是0，并且一个字符串先遍历完，返回两个字符串的长度之差，
        // 如果返回正数，表示 s1 > s2
        // 如果返回负数，表示s1 < s2
        System.out.println(s1.compareTo(s2));

        /**
         * compareToIgnoreCase不区分大小写
         */
        String ss1 = "g";
        String ss2 = "G";
        System.out.println(ss1.compareToIgnoreCase(ss2));

        /**
         * concat
         */
        System.out.println(ss1.concat(ss2));

        /**
         * contains
         */
        System.out.println(str.contains("g"));

        /**
         * endswith
         */
        System.out.println(ss1.endsWith("g"));
        System.out.println(ss1.startsWith("g"));

        /**
         * getBytes
         */
//        byte[] bs = str.getBytes("GBK");
        byte[] bs = str.getBytes(StandardCharsets.UTF_8);
        // 默认当前工程的编码
        byte[] bs2 = str.getBytes();

        String strBytes = new String(bs2, StandardCharsets.UTF_8);

        // char 类型用的编码是utf-16
        String str22 = "编码";
        System.out.println(str.hashCode());

        /**
         * indexoOf('a')
         */
        String stre = "aonaaaasdgadsg";
        System.out.println(stre.indexOf('a'));
        System.out.println(stre.indexOf("on"));

        /**
         * intern 常量池地址
         */
        str.intern();

        /**
         * 判断字符串是否为空,length为零就是空
         */
        str.isEmpty();

        /**
         * replace
         */
        System.out.println(stre.replace('a', '+'));

        /**
         * substring
         */
        System.out.println("stre:" + stre);
        System.out.println(stre.substring(3));
        System.out.println(stre.substring(2, 5)); // 都是索引

        /**
         *表示将其他类型的数据转化为字符串
         */
        String strval = String.valueOf(6);
        Object o = new Object();
        String stro = String.valueOf(o);
//        System.out.println(stro);
//        System.out.println(o);

        char[] cso = {'a', 'b', 'c'};
        String strarr = String.valueOf(cso); // 特殊的数组
        String strarr2 = cso.toString();
        System.out.println(strarr);
        System.out.println(strarr2);





    }

}
