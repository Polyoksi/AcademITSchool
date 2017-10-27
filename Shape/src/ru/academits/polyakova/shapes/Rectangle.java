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
        return "Стороны прямоугольника " + side1 + " " + side2;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }
        Rectangle r = (Rectangle) o;
        return side1 == r.side1 && side2 == r.side2;
    }

    public int hashCode() {
        final int prime = 7;
        int hash = 1;
        hash = prime * hash + (int) side1;
        hash = hash + prime * hash + (int) side2;
        return hash;
    }
}
