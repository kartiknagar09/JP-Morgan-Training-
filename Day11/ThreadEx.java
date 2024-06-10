class MyThread extends Thread {
    // Override the run() method to define the behavior of the thread
    @Override
    public void run() {
        // Code inside run() will be executed when the thread starts
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread: " + i);
            try {
                // Introduce a short delay to simulate some work
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }
}

public class ThreadEx {
    public static void main(String[] args) {
        // Create an instance of MyThread
        MyThread thrd = new MyThread();

        // Start the thread
        thrd.start();

        // Code in main thread continues executing alongside the new thread
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main: " + i);
            try {
                // Introduce a short delay to simulate some work
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted.");
            }
        }
    }
}
