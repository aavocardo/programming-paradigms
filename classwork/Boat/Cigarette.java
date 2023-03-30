package Boat;

public class Cigarette extends Thread {
    public void run() {
        Catamaran.INVENTORY++;

        System.out.println("Inventory = " + Catamaran.INVENTORY);
    }
}
