package task02.utils;

import task02.data.Ball;
import task02.data.Circle;
import task02.data.Cube;
import task02.data.Rectangle;

public class ShapeCalculator extends LineCalc implements Calc2D, Calc3D {

    @Override
    public double circleArea(Circle circle) {
        return Math.PI * Math.pow(circle.getRadius(), 2);
    }

    @Override
    public double rectangleArea(Rectangle rectangle) {
        return rectangle.getSideA() * rectangle.getSideB();
    }

    @Override
    public double ballVolume(Ball ball) {
        return 4.0 / 3.0 * Math.PI * Math.pow(ball.getRadius(), 3);
    }

    @Override
    public double cubeVolume(Cube cube) {
        return Math.pow(cube.getSide(), 3);
    }
}