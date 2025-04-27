import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {

        Stack<String> s = new Stack<>();
        s.push("a");
        s.push("b");


        System.out.println(s);


        // peek 获取而不移除栈顶元素
        String b = s.peek();

        // 获取并移除栈顶元素
//        String b1 = s.pop();

        // 从1开始查找
        System.out.println(s.search("a"));
        System.out.println(s);

    }
}