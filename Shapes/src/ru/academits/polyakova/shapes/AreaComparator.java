package ru.academits.polyakova.shapes;

import java.util.Comparator;

public class AreaComparator implements Comparator<Shapes> {
    public int compare(Shapes o1, Shapes o2) {
        if (o1.getArea() == o2.getArea()) {
            return 0;
        } else {
            return o1.getArea() > o2.getArea() ? -1 : 1;
        }
    }

}

