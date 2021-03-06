package ru.academits.polyakova.range.main;

import ru.academits.polyakova.range.Range;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        double number = scanner.nextDouble();
        Range range = new Range(5, 15);
        System.out.printf("Длина отрезка: %.2f%n", range.getLength());
        if (range.isInside(number)) {
            System.out.printf("Ваше число принадлежит отрезку от %.2f до %.2f%n", range.getFrom(), range.getTo());
        } else {
            System.out.printf("Ваше число не принадлежит отрезку от %.2f до %.2f%n", range.getFrom(), range.getTo());
        }

        Range interval1 = new Range(15, 20);
        Range resultCrossing = range.getCrossing(interval1);
        if (resultCrossing != null) {
            System.out.printf("Пересечение интервалов: [%.2f, %.2f]%n", resultCrossing.getFrom(), resultCrossing.getTo());
        } else {
            System.out.println("Интервалы не пересекаются");
        }

        Range[] resultUnion = range.getUnion(interval1);
        System.out.print("Объединение интервалов: ");
        for (Range e : resultUnion) {
            System.out.printf("[%.2f, %.2f] ", e.getFrom(), e.getTo());
        }

        Range[] resultResidual = range.getResidual(interval1);
        if (resultResidual.length >= 1) {
            System.out.printf("%nРазность интервалов: ");
            for (Range e : resultResidual) {
                System.out.printf("[%.2f, %.2f] ", e.getFrom(), e.getTo());
            }
        } else {
            System.out.printf("%nРазности нет, т.к. первый интервал является частью второго");
        }
    }
}

