public class BackgroundJob {

    public static void main(String[] args) {

        Runnable task = () -> {
            System.out.println("Background task is running...");
            for (int i = 1; i <= 5; i++) {
                System.out.println("Processing step " + i);
            }
            System.out.println("Task completed!");
        };

        Thread thread = new Thread(task);

        thread.start();

        System.out.println("Main method finished.");
    }
}