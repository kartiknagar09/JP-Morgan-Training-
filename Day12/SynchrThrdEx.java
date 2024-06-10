class Counter {
    private int count = 0;

    // Method to increment count with synchronization
    public synchronized void incrementCount() {
        count++;
    }

    // Method to get the current count value
    public int getCount() {
        return count;
    }
}

class MyThread extends Thread {
    private Counter counter;

    public MyThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5000; i++) {
            // Read the current count
            int currentCount = counter.getCount();

            // Print the count along with the thread name
            System.out.println(Thread.currentThread().getName() + " - Count: " + currentCount);

            // Increment the count using synchronized method
            counter.incrementCount();
        }
    }
}

public class SynchrThrdEx {
    public static void main(String[] args) {
        // Create a shared Counter object
        Counter counter = new Counter();

        // Create two threads with the shared Counter object
        MyThread thread1 = new MyThread(counter);
        MyThread thread2 = new MyThread(counter);

        // Start both threads
        thread1.start();
        thread2.start();
    }
}
