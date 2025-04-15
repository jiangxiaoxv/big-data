import java.util.Scanner;

public class MethodExer2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // 获取行数
        int n = s.nextInt();

        // 大于等于6的偶数
        while(n < 6 || n % 2 == 1) {
            n = s.nextInt();
        }

        for (int i = 3; i <= n / 2; i += 2) {
            if (isPrime(i) && isPrime(n - i)) {
                System.out.println(n + "=" + i + "+" + (n - i));
//                break;
            }
        }
    }

    // 判断是否为质数
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }

        if (num == 2) {
            return true;
        }

        if (num % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= num / 2; i+=2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // 亲密数：如果一个整数A的所有因子（含1而不包含本身）之和等于B，并且B的所有因子之和等于A，那么A和B就是一对亲密数



}