public class VoidDemo {
    // strictfp 只能作用在方法上，表示方法正在计算过程中是以80位二进制进行计算
    // 在计算完成以后依然会以64位二进制进行存储
    public strictfp static void main(String[] args) {
        System.out.println("启动了");
    }

    public static void m1() {
        System.out.println("m1~~~~~~");
    }

    public static Void m2() {
        System.out.println("m2~~~~~~");
        return null;
    }
}