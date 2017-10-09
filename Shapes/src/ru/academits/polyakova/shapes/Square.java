package ru.academits.polyakova.shapes;

public class Square implements Shapes {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getWidth() {
        return side;
    }

    public double getHeight() {
        return side;
    }

    public double getArea() {
        return side * side;
    }

    public double getPerimeter() {
        return side * 4;
    }

    public String toString() {
        return "Сторона квадрата " + side;
    }
}
