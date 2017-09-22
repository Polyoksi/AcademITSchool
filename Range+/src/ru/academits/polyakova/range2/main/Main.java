package ru.academits.polyakova.range2.main;

import ru.academits.polyakova.range2.Range;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] interval1 = new double[]{1, 8};
        double[] interval2 = new double[]{5, 6};
        System.out.println("Длина первого интервала: " + Range.getLength(interval1));
        System.out.println("Длина второго интервала: " + Range.getLength(interval2));
        double[] crossing = Range.getCrossing(interval1, interval2);
        System.out.println("Пересечение интервалов: " + Arrays.toString(crossing));
        double[] union = Range.getUnion(interval1, interval2);
        System.out.println("Объединение итервалов: " + Arrays.toString(union));
        double[] residual = Range.getResidual(interval1, interval2);
        System.out.println("Разность итервалов: " + Arrays.toString(residual));
    }
}
