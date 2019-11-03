package task02;

import task02.data.*;
import task02.utils.ShapeCalculator;

public class ShapeCalculatorApp {
    public static void main(String[] args) {
        ShapeCalculator shapeCalculator = new ShapeCalculator();

        Point point1 = new Point(5, 4);
        Point point2 = new Point(-7, -3);
        Line2D line1 = new Line2D(point1, point2);
        System.out.println(line1 + "" + shapeCalculator.lineLength(line1));

        Circle circle1 = new Circle(4.5);
        System.out.println(circle1 + "" + shapeCalculator.circleArea(circle1));

        Rectangle rectangle1 = new Rectangle(5, 6.5);
        System.out.println(rectangle1 + "" + shapeCalculator.rectangleArea(rectangle1));

        Ball ball1 = new Ball(5);
        System.out.println(ball1 + "" + shapeCalculator.ballVolume(ball1));

        Cube cube1 = new Cube(5);
        System.out.println(cube1 + "" + shapeCalculator.cubeVolume(cube1));
    }
}