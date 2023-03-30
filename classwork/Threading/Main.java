package Threading;

public class Main {
    public static void main(String[] args) {
        MyThread t1, t2, t3;
        t1 = new MyThread("Thread One");
        t2 = new MyThread("Thread Two");
        t3 = new MyThread("Thread Three");

        t1.start();
        t2.start();
        t3.start();
    }
}
