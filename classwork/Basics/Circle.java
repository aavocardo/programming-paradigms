package Basics;

public class Circle {
    protected final Double radius;
    public Double area;

    Circle(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Value is negative");
        }
        this.radius = radius;
        this.area = area();
    }
    public Double area() {
        return Math.PI * Math.pow(this.radius, 2);
    }

}
