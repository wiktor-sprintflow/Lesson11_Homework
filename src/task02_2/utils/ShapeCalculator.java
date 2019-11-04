package task02_2.utils;
import task02_2.data.Shape;

public class ShapeCalculator extends LineCalc implements Calc2D, Calc3D {

    public double calculate(Shape shape) {
        return shape.calculateShape();
    }
}