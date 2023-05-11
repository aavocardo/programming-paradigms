package Boat;

import java.util.Vector;
import java.util.Collections;

public class Main {
    // Cigarette increments <int> INVENTORY variable
    // Catamaran decrements <int> INVENTORY variable
    public static void main(String[] args) {
        Vector<Thread> threads = new Vector<>();

        int countOfCigarettes = 10;
        int countOfCatamarans = 10;

        for (int i = 0; i < countOfCigarettes; i++) {
            threads.add(new Cigarette());
        }

        for (int i = 0; i < countOfCatamarans; i++) {
            threads.add(new Catamaran());
        }

        Collections.shuffle(threads);

        printThreads(threads);
        startThreads(threads);
    }

    public static void printThreads(Vector<Thread> threads) {
        for (Thread t : threads) {
            System.out.println(t.getClass());
        }
    }

    public static void startThreads(Vector<Thread> threads) {
        for (Thread t : threads) {
            t.start();
        }
    }
}
