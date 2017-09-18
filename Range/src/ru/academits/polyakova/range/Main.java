package ru.academits.polyakova.range;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        double number = scanner.nextDouble();
        Range range = new Range(4.7, 90.6);
        System.out.printf("Длина отрезка: %.2f%n", range.getLength());
        if (range.isInside(number)) {
            System.out.println("Ваше число принадлежит отрезку от 4.7 до 90.6");
        } else {
            System.out.println("Ваше число не принадлежит отрезку от 4.7 до 90.6");
        }
    }
}
