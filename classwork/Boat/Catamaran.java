package Boat;

public class Catamaran extends Thread {
    protected static int INVENTORY = 0;
    public void run() {
        INVENTORY--;
        System.out.println("Inventory = " + INVENTORY);
    }
}
