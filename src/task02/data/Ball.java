package task02.data;

public class Ball extends Shape3D {
    private double radius;

    public Ball(double radius) {
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
        return "Kula o promieniu " + radius + " ma objętość, która wyosi ";
    }
}