package task02.utils;

import task02.data.*;

public class ShapeCalculator extends LineCalc implements Calc2D, Calc3D {

    public double shapeArea(GeometricShape shape) {
        return shape.calculateArea();
    }

    public double volume(Shape3D shape) {
        return shape.calculateVolume();
    }
}