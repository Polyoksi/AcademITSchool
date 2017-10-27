package ru.academits.polyakova.shapes.main;

import ru.academits.polyakova.shapes.Shapes;

import java.util.Comparator;

public class PerimeterComparator implements Comparator<Shapes> {
    public int compare(Shapes o1, Shapes o2) {
        if (o1.getPerimeter() == o2.getPerimeter()) {
            return 0;
        } else {
            return o1.getPerimeter() > o2.getPerimeter() ? -1 : 1;
        }
    }
}
