package ru.academits.polyakova.shape.main;

import ru.academits.polyakova.shape.Shape;

import java.util.Comparator;

public class AreaComparator implements Comparator<Shape> {
    public int compare(Shape o1, Shape o2) {
        if (o1.getArea() == o2.getArea()) {
            return 0;
        } else {
            return o1.getArea() > o2.getArea() ? -1 : 1;
        }
    }

}

