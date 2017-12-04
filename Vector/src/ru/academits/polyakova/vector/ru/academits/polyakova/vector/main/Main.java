package ru.academits.polyakova.vector.ru.academits.polyakova.vector.main;

import ru.academits.polyakova.vector.Vector;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        double[] array1 = new double[]{1, 2, 23};
        double[] array2 = new double[]{2, 54, 3};
        double[] array3 = new double[]{7, 5};
        double[] array4 = new double[]{5, 3, 9};
        Vector vector1 = new Vector(array1);
        Vector vector2 = new Vector(array2);
        double[] array5 = new double[]{-3, 51, 6};
        Vector vector5 = new Vector(array5);
        int n = 3;
        Vector vector3 = new Vector(n, array3);
        Vector vector4 = new Vector(array4);
        System.out.print(vector1);
        System.out.println();
        System.out.print(vector3);
        System.out.println();
        System.out.println("Сумма векторов: " + Arrays.toString(vector1.sum(vector2)));
        System.out.println("Разность векторов: " + Arrays.toString(vector2.dif(vector4)));
        System.out.println("Умножение на число: " + vector3.toString() + " * " + 6 + " = "
                + Arrays.toString(vector3.multiplication(6)));
        System.out.println("Разворот: " + Arrays.toString(vector4.turn()));
        System.out.printf(vector1.toString() + vector2.toString());
        System.out.println();
        System.out.println("Сумма векторов: " + Vector.sumVector(vector1, vector2));
        System.out.printf(vector3.toString() + vector4.toString());
        System.out.println();
        System.out.println("Разность векторов: " + Vector.difVector(vector3, vector4));
        System.out.printf(vector3.toString() + vector4.toString());
        System.out.println();
        System.out.println("Скалярное произведение: " + Vector.scalarMultiplication(vector3, vector4));
        System.out.printf(vector2.toString() + vector5.toString());
        System.out.println();
        if (vector2.equals(vector5)) {
            System.out.println("Вектора равны");
        } else {
            System.out.println("Вектора не равны");
        }
    }
}
