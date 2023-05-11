package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(15);
        System.out.println("Circle area = " + circle.getArea());
        System.out.println("Circle perimeter = " + circle.getPerimeter());

        Shape rectangle = new Rectangle(5, 10);
        System.out.println("Rectangle area = " + rectangle.getArea());
        System.out.println("Rectangle perimeter = " + rectangle.getPerimeter());

        Shape triangle = new Triangle(6, 6, 8);
        System.out.println("Triangle area = " + triangle.getArea());
        System.out.println("Triangle perimeter = " + triangle.getPerimeter());
    }
}
