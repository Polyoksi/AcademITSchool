package ru.academits.polyakova.shapes;

import sun.nio.cs.ext.MS874;

public class Triangle implements Shapes {
    private double x1;
    private double x2;
    private double x3;
    private double y1;
    private double y2;
    private double y3;

    public Triangle(double x1, double x2, double x3, double y1, double y2, double y3) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
    }

    private double getSide(double x1, double x2, double y1, double y2) {
        return Math.sqrt((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
    }

    public double getWidth() {
        return Math.max(Math.max(x1, x2), x3) - Math.min(Math.min(x1, x2), x3);
    }

    public double getHeight() {
        return Math.max(Math.max(y1, y2), y3) - Math.min(Math.min(y1, y2), y3);
    }

    public double getArea() {
        return Math.abs(((x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1))) / 2;
    }

    public double getPerimeter() {
        return getSide(x1, x2, y1, y2) + getSide(x1, x3, y1, y3) + getSide(x2, x3, y2, y3);
    }

    public String toString() {
        return "Стороны треугольника " + getSide(x1, x2, y1, y2) + " " + getSide(x1, x3, y1, y3) + " " +
                getSide(x2, x3, y2, y3);
    }
}
