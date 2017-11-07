package ru.academits.polyakova.shape.main;

import ru.academits.polyakova.shape.Shape;

import java.util.Comparator;

public class PerimeterComparator implements Comparator<Shape> {
    public int compare(Shape o1, Shape o2) {
        if (o1.getPerimeter() == o2.getPerimeter()) {
            return 0;
        } else {
            return o1.getPerimeter() > o2.getPerimeter() ? -1 : 1;
        }
    }
}
