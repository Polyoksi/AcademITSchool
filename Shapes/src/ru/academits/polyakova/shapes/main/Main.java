package ru.academits.polyakova.shapes.main;

import ru.academits.polyakova.shapes.*;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    private static void getMaxArea(Shapes[] shapes) {
        Arrays.sort(shapes, new AreaComparator());
        System.out.println("Площади фигур");
        for (Shapes i : shapes) {
            System.out.printf("%.2f  ", i.getArea());
        }
        System.out.println();
        System.out.printf("Максимальная площадь: %.2f%n", shapes[0].getArea());
    }

    private static void getSecondPerimeter(Shapes[] shapes) {
        Arrays.sort(shapes, new PerimeterComparator());

        System.out.println("Периметры фигур ");
        for (Shapes i : shapes) {
            System.out.printf("%.2f  ", i.getPerimeter());
        }
        System.out.println();
        System.out.printf("Второй по величине периметр %.2f%n", shapes[1].getPerimeter());
    }

    public static void main(String[] args) {
        Shapes[] shapes = {new Circle(5), new Circle(4), new Rectangle(3, 5), new Square(5),
                new Triangle(1, 2, 2, 6, 6, 1), new Rectangle(2, 6)};
        getMaxArea(shapes);
        getSecondPerimeter(shapes);
        System.out.println(shapes[0]);
    }
}
