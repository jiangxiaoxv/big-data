
public class RunnableDemo {
    public static void main(String[] args) {
        RDemo r = new RDemo();
        Thread t = new Thread(r);
        t.start();


//        Runnable r2 = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("hello");
//            }
//        };

//        Runnable r3 = () -> System.out.println("hello");
//        new Thread(() -> System.out.println("hello3")).start();
    }
}

class RDemo implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}