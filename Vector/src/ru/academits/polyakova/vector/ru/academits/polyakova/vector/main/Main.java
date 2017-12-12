package ru.academits.polyakova.vector.ru.academits.polyakova.vector.main;

import ru.academits.polyakova.vector.Vector;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        double[] array1 = new double[]{1, 2, 3};
        double[] array2 = new double[]{2, 54};
        double[] array3 = new double[]{7, 5};
        double[] array4 = new double[]{5, 3, 12};
        Vector vector1 = new Vector(array1);
        Vector vector2 = new Vector(array2);
        double[] array5 = new double[]{-3, 51};
        Vector vector5 = new Vector(array5);
        int n = 3;
        Vector vector3 = new Vector(n, array3);
        Vector vector4 = new Vector(array4);
        System.out.print(vector1);
        System.out.println();
        System.out.print(vector3);
        System.out.println();
        vector1.sum(vector2);
        System.out.println("Сумма векторов: " + vector1);
        vector2.dif(vector4);
        System.out.println("Разность векторов: " + vector2);
        vector3.multiplication(6);
        System.out.println("Умножение на число: " + vector3.toString() + " * " + 6 + " = "
                + vector3);
        vector4.turn();
        System.out.println("Разворот: " + vector4);
        System.out.printf(vector1.toString());
        System.out.println();
        vector1.setItem(1, 10);
        System.out.println("Замена элемента по индексу " + "1: " + vector1);
        System.out.printf(vector1.toString() + vector2.toString());
        System.out.println();
        System.out.println("Сумма векторов: " + Vector.sumVector(vector1, vector2));
        System.out.printf(vector3.toString() + vector4.toString());
        System.out.println();
        System.out.println("Разность векторов: " + Vector.difVector(vector3, vector4));
        System.out.printf(vector5.toString() + vector4.toString());
        System.out.println();
        System.out.println("Скалярное произведение: " + Vector.scalarMultiplication(vector5, vector4));
        if (vector5.equals(vector4)) {
            System.out.println("Векторы равны");
        } else {
            System.out.println("Векторы не равны");
        }
    }
}
