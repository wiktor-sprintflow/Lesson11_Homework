package task02_2.data;

import task02_2.utils.LineCalc;

public class Line2D extends Shape2D {
    private Point pointA;
    private Point pointB;

    public Line2D(Point pointA, Point pointB) {
        this.pointA = pointA;
        this.pointB = pointB;
    }

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    @Override
    public String toString() {
        return "Odcinek wyznaczony przez współrzędne " + pointA + pointB + " ma długość " + LineCalc.lineLength(this);
    }

    @Override
    public double calculateShape() {
        return Math.sqrt(Math.pow(pointA.getX() - pointB.getX(), 2) +
                Math.pow(pointA.getY() - pointB.getY(), 2));
    }
}