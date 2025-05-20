//package `2025-05-11`

public class SelllTicketDemo {
    public static void main(String[] args) {
        System.out.println("Selll Ticket Demo");
        Ticket ticket = new Ticket();
        ticket.setCount(100);

        Sell s1 = new Sell(ticket, "1号员工");
        Sell s2 = new Sell(ticket, "2号员工");
        Sell s3 = new Sell(ticket, "3号员工");
        Sell s4 = new Sell(ticket, "4号员工");

        s1.start();
        s2.start();
        s3.start();
        s4.start();

    }

}

class Sell extends Thread {
    final Ticket ticket;
    private String name;

    public Sell(Ticket ticket, String name) {
        this.ticket = ticket;
        this.name = name;
    }

    @Override
    public void run() {
        while (true) {

            // 同步代码块 --- 需要一把锁
            // 锁要求所有的线程都认识
//            synchronized (ticket) {
// Seller 类的字节码是存在方法区的，方法区是被所有线程共享的
//            synchronized (SelllTicketDemo.class) {
//            synchronized (this) { // this 必须是同一个对象
            synchronized (SelllTicketDemo.class) {

                if (ticket.getCount() <= 0) {
                    break;
                }
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                ticket.setCount(ticket.getCount() - 1);
                System.out.println(name + "剩余的票数: " + ticket.getCount());
            }
        }
    }
}

class Ticket {
    private int count;
    public Ticket() {}
    public void setCount(int count) {
        this.count = count;
    }
    public int getCount() { return count; }
}