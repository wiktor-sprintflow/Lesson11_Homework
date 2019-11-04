package task02;

import task02.data.*;

public class ShapeCalculatorApp {
    public static void main(String[] args) {

        Point point1 = new Point(5, 4);
        Point point2 = new Point(-7, -3);
        Line2D line1 = new Line2D(point1, point2);

        Circle circle1 = new Circle(4.5);
        Rectangle rectangle1 = new Rectangle(5, 6.5);

        Ball ball1 = new Ball(5);
        Cube cube1 = new Cube(5);

        Shape[] shapes = new Shape[5];
        shapes[0] = line1;
        shapes[1] = circle1;
        shapes[2] = rectangle1;
        shapes[3] = ball1;
        shapes[4] = cube1;

        showShapeDetails(shapes);
    }

    private static void showShapeDetails(Shape[] shapes) {
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}