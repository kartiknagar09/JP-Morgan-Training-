class MyThread extends Thread {
    private int start;
    private int end;

    public MyThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}

public class MultiThrdEx {
    public static void main(String[] args) {
        // Create two threads
        MyThread thrd1 = new MyThread(1, 2500);
        MyThread thrd2 = new MyThread(2501, 5000);

        // Start both threads
        thrd1.start();
        thrd2.start();
    }
}
