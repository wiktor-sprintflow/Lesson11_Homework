package task02.data;

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
        return "Odcinek wyznaczony przez współrzędne " + pointA + pointB + " ma długość ";
    }
}