package ex2;

public class Circle implements IShape{

    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return 2 * 3.14 * radius;
    }

    @Override
    public double getPerimeter() {
        return 3.14 * 3.14 * radius;
    }
}
