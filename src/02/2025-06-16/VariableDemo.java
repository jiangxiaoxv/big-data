public class VariableDemo {
    public static void main(String[] args) {
        int sum = add(1, 2, new int[] {5});
        int sum2 = add(1, 2, 0, 12);

        System.out.println(sum);
    }

    // 可变参数允许传入端的参数个数随意变化()
    // 可变参数本质是数组
    // 可变参数在一个方法中只能定义一个可变参数
    // 这唯一的一个可变参数修定义到参数列表的末尾
    public static int add(int i, int j, int ...arr) {
        System.out.println(arr.length);
        int sum = 0;
        for (int a : arr) {
            sum += a;
        }
        return i + j + sum;
    }
}