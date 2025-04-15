
public class MethodDemo {
    public  static void main(String[] args) {
        int sum = 0;
        int result = MethodDemo.sum(1, 3);
        System.out.println(result);
    }

    // 求n - m之间的所有的整数的和
    public static int sum(int n, int m) {
        int result = 0;
        for (int i = n; i <= m; i++) {
            result += i;
        }
        return result;
    }


    public static double sum(double n, double m) {
        return n + m;
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

    // 任何大与6的数都可以分解为两个质数的和

}