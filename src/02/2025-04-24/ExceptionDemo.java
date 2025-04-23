import java.text.SimpleDateFormat;

public class ExceptionDemo {
    public static void main(String[] args)  {
//        System.out.println(1/0); // 运行时异常
        System.out.println(m());
    }

    // 代码是从上到下从左到右依次来编译运行的
    public static int m() {
        int i = 3;
        try {
            // 先编译return i++
            // 先编译出return 3； -》表示将3作为结果返回
            // 将3标记为结果
            //由于return在try之内
            // 所以在返回结果之前，需要先检查是否有finally需要执行
            //然后再编译i++ -》 4
            // 当finally执行完成之后，需要返回结果
            // 此时由于将3标记了结果，所以返回3
            return i++;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally:" + i);
            return i++;
            // 此时i再次自增变为5
//            i++;
//            System.out.println("finally" +i);
//            return i;
        }
    }
}

