class MyThread extends Thread {
    private int start;
    private int end;

    public MyThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        if (start < end) {
            for (int i = start; i <= end; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        } else {
            for (int i = start; i >= end; i--) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        }
    }
}

public class TwoThrdEx {
    public static void main(String[] args) {
        // Create two threads
        MyThread thread1 = new MyThread(1, 5000);
        MyThread thread2 = new MyThread(5000, 1);

        // Start both threads
        thread1.start();
        thread2.start();
    }
}
