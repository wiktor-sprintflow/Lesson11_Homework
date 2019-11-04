package task02.utils;

import task02.data.Line2D;

public class LineCalc {

    public static double lineLength(Line2D line) {
        return Math.sqrt(Math.pow(line.getPointA().getX() - line.getPointB().getX(), 2) +
                Math.pow(line.getPointA().getY() - line.getPointB().getY(), 2));
    }

}