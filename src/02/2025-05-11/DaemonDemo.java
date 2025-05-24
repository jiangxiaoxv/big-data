//package daemon;
public class DaemonDemo {
    public static void main(String[] args) throws InterruptedException {
//        System.out.println("hha") ;

        Thread t1 = new Thread(new Solider() {});
        Thread t2 = new Thread(new Solider() {});
//        Thread t3 = new Thread(new Solider() {});

        // 设置守护线程
        t1.setDaemon(true);
        t2.setDaemon(true);

        t1.start();
        t2.start();

        for (int i = 10; i > 0; i--){
            System.out.println("剩余" + i);
            Thread.sleep(1000);
        }
    }

}

class Solider implements Runnable {
    public void run() {
        for (int i = 1000; i > 0; i--){
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}