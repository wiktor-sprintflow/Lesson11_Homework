package task02.data;

public class Rectangle extends GeometricShape {
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    @Override
    public String toString() {
        return "Prostokąt o długościach boków " + sideA + " i " + sideB + " ma pole, które wynosi " + calculateArea();
    }

    @Override
    public double calculateArea() {
        return sideA * sideB;
    }
}