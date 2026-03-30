class Ticket extends Thread {
    private int ticketId;
    private String type;

    public Ticket(int ticketId, String type) {
        this.ticketId = ticketId;
        this.type = type;
    }

    public void run() {
        long start = System.currentTimeMillis();

        System.out.println("Ticket " + ticketId + " [" + type + "] started by "
                + Thread.currentThread().getName() + " | Priority: "
                + getPriority());

        int time = (int)(Math.random() * 5 + 1);

        try {
            Thread.sleep(time * 1000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }

        long end = System.currentTimeMillis();

        System.out.println("Ticket " + ticketId + " [" + type + "] completed by "
                + Thread.currentThread().getName() + " | Time: "
                + (end - start) + " ms");
    }
}

public class TicketSystem {
    public static void main(String[] args) {

        Ticket t1 = new Ticket(1, "Critical Bug");
        Ticket t2 = new Ticket(2, "Feature Request");
        Ticket t3 = new Ticket(3, "General Query");
        Ticket t4 = new Ticket(4, "Feedback");
        Ticket t5 = new Ticket(5, "Critical Bug");
        Ticket t6 = new Ticket(6, "Feature Request");
        Ticket t7 = new Ticket(7, "General Query");
        Ticket t8 = new Ticket(8, "Feedback");
        Ticket t9 = new Ticket(9, "Critical Bug");
        Ticket t10 = new Ticket(10, "General Query");

        t1.setPriority(10);
        t2.setPriority(4);
        t3.setPriority(2);
        t4.setPriority(1);
        t5.setPriority(10);
        t6.setPriority(4);
        t7.setPriority(2);
        t8.setPriority(1);
        t9.setPriority(10);
        t10.setPriority(2);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();
    }
}