package ru.academits.polyakova.shapes.main;

import ru.academits.polyakova.shapes.*;

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
        for (int i = 0; i < shapes.length; i++) {
            for (int j = 0; j < shapes.length; j++) {
                if (shapes[i].getPerimeter() > shapes[j].getPerimeter()) {
                    Shapes temp = shapes[i];
                    shapes[i] = shapes[j];
                    shapes[j] = temp;
                }
            }
        }
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
