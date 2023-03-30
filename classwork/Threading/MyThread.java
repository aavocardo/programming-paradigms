package Threading;

public class MyThread extends Thread {
    String threadName;
    public static int acc = 0;

    public void run() {
        System.out.println(threadName);
        acc++;
        System.out.println(threadName + " - acc: " + acc);
    }

    public MyThread(String threadName) {
        this.threadName = threadName;
    }
}
