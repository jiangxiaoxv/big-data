
public class AssertDemo {
    public static void main(String[] args) {
        int i = 5;
        i += i -= i *= 3;

        i += 15;
        System.out.println(i);

        // 断定结果一定是小于0；
        assert  i < 0 : "结果预测应该小于0";

        System.out.println(i);
    }
}