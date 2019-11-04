package task02.utils;

import task02.data.*;

public class ShapeCalculator extends LineCalc implements Calc2D, Calc3D {

    public double shapeArea(GeometricShape shape) {
        if (shape instanceof Circle) {
            return Math.PI * Math.pow(((Circle) shape).getRadius(), 2);
        } else if (shape instanceof Rectangle) {
            return ((Rectangle) shape).getSideA() * ((Rectangle) shape).getSideB();
        } else {
            System.out.println("Nieznana figura");
            return -1;
        }
    }

    public double volume(Shape3D shape) {
        if (shape instanceof Ball) {
            return 4.0 / 3.0 * Math.PI * Math.pow(((Ball) shape).getRadius(), 3);
        } else if (shape instanceof Cube) {
            return Math.pow(((Cube) shape).getSide(), 3);
        } else {
            System.out.println("Nieznana bryła");
            return -1;
        }
    }
}