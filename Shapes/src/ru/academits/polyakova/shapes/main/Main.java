package ru.academits.polyakova.shapes.main;

import ru.academits.polyakova.shapes.*;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    private void getMaxArea(Shapes[] shapes) {
        double maxArea = 0;
        for (Shapes i : shapes) {
            if (i.getArea() > maxArea) {
                maxArea = i.getArea();
            }
        }
        System.out.println("Площади фигур");
        for (Shapes i : shapes) {
            System.out.printf("%.2f  ", i.getArea());
        }
        System.out.println();
        System.out.printf("Максимальная площадь: %.2f%n", maxArea);
    }

    private void getSecondPerimeter(Shapes[] shapes) {
        Arrays.sort(shapes, new Comparator<Shapes>() {
            @Override
            public int compare(Shapes o1, Shapes o2) {
                return 0;
            }
        });
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

        Main maxShape = new Main();
        maxShape.getMaxArea(shapes);
        maxShape.getSecondPerimeter(shapes);
        System.out.println(shapes[0]);
    }
}
