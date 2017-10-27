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

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }
        Square s = (Square) o;
        return side == s.side;
    }

    public int hashCode() {
        final int prime = 7;
        int hash = 1;
        hash = prime * hash + (int) side;
        return hash;
    }
}
