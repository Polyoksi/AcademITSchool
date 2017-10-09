package ru.academits.polyakova.shapes;

public class Rectangle implements Shapes {
    private double side1;
    private double side2;

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public double getWidth() {
        return side1;
    }

    public double getHeight() {
        return side2;
    }

    public double getArea() {
        return side1 * side2;
    }

    public double getPerimeter() {
        return side1 * 2 + side2 * 2;
    }

    public String toString() {
        return "Стороны прямоугольника " + side1 + side2;
    }
}
