class Entry implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Students entering... " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Entry stopped");
            }
        }
    }
}

class QuestionPaper implements Runnable {
    public void run() {
        try {
            Thread.sleep(5000);
            System.out.println("Question papers distributed | State: "
                    + Thread.currentThread().getState());
        } catch (InterruptedException e) {
            System.out.println("Paper distribution interrupted");
        }
    }
}

class Attendance implements Runnable {
    public void run() {
        try {
            Thread.sleep(10000);
            System.out.println("Attendance marked | State: "
                    + Thread.currentThread().getState());
        } catch (InterruptedException e) {
            System.out.println("Attendance interrupted");
        }
    }
}

class Collection implements Runnable {
    public void run() {
        try {
            Thread.sleep(15000);
            System.out.println("Answer sheets collected | State: "
                    + Thread.currentThread().getState());
        } catch (InterruptedException e) {
            System.out.println("Collection interrupted");
        }
    }
}

public class ExamHall {
    public static void main(String[] args) {

        Thread entry = new Thread(new Entry());
        Thread paper = new Thread(new QuestionPaper());
        Thread attendance = new Thread(new Attendance());
        Thread collection = new Thread(new Collection());

        paper.setPriority(10);
        attendance.setPriority(8);
        collection.setPriority(7);
        entry.setPriority(5);

        entry.start();
        paper.start();
        attendance.start();
        collection.start();
    }
}