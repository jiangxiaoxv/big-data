import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class MathDemo {
    // strictfp 只能作用在方法上，表示方法正在计算过程中是以80位二进制进行计算
    // 在计算完成以后依然会以64位二进制进行存储
    public strictfp static void main(String[] args) {
//        System.out.println(Math.E);
//        System.out.println(Math.PI);
//        System.out.println(Math.ceil(3.2));
//        System.out.println(Math.floor(3.2));
//
//        System.out.println(Math.round(3.567));
//        System.out.println(Math.random());

        Random r = new Random();
        System.out.println(r.nextInt(50) + 30);

        // 要想进行精确存储和运算，那么需要将参数以字符串形式传入
//        BigDecimal bd1 = new BigDecimal(3.24);
        BigDecimal bd1 = new BigDecimal("3.24");
        BigDecimal bd2 = new BigDecimal("2.98");

        System.out.println(bd1.subtract(bd2));

        BigInteger bi1 = new BigInteger("235239591357023515012935123512835831258132582135123053372937512635912350132");
        BigInteger bi2 = new BigInteger("935239591357023515012935123512835831258132582135123053372937512635912350132");

        System.out.println(bi1.multiply(bi2));

    }
}