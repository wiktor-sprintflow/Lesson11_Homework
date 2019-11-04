package task02_2.data;

public class Cube extends Shape3D {

    private double side;

    public Cube(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Sześcian o długości krawędzi " + side + " ma objętość która wynosi ";
    }

    @Override
    public double calculateShape() {
        return Math.pow(side, 3);
    }
}