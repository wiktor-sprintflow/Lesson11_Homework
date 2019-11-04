package task02_2.data;

public class Circle extends GeometricShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Koło o promieniu " + radius + " ma pole, które wynosi ";
    }

    @Override
    public double calculateShape() {
        return Math.PI * Math.pow(radius, 2);
    }
}