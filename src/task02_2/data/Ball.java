package task02_2.data;

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
        return "Kula o promieniu " + radius + " ma objętość, która wynosi ";
    }

    @Override
    public double calculateShape() {
        return 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
    }
}
