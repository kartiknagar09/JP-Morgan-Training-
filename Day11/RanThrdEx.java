class MyRunnable implements Runnable {
    private int start;
    private int end;

    public MyRunnable(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
 try {
                // Introduce a short delay to simulate some work
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }
}

public class RanThrdEx {
    public static void main(String[] args) {
        // Create two instances of MyRunnable
        MyRunnable runnable1 = new MyRunnable(1, 2500);
        MyRunnable runnable2 = new MyRunnable(2501, 5000);

        // Create two threads with MyRunnable instances
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        // Start both threads
        thread1.start();
        thread2.start();
    }
}
