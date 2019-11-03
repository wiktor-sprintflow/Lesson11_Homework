package task02.data;

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
}