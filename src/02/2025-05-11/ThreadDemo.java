public class ThreadDemo  {
    public static void main(String[] args) {
        TDemo t = new TDemo();

        //  启动执行任务
        t.start();
        for (int i = 0  ;i < 10; i++) {
            System.out.println("main:" + i);
        }
    }


}

class TDemo extends Thread {
    // 线程需要执行的逻辑需要放到run方法中
    public void run() {
        for (int i = 0  ;i < 10; i++) {
            System.out.println("thread:" + i);
        }
    }
}