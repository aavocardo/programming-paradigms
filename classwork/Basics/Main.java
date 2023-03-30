package Basics;

import java.util.Random;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Vector<Circle> circles = new Vector<>();

        for (int i = 0; i <= 6; i++) {
            circles.add(new Circle(random.nextInt(30)));
        }

        Circle firstElement = circles.firstElement();
        System.out.println(firstElement);
    }
}
