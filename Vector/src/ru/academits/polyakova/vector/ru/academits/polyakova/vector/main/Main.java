package ru.academits.polyakova.vector.ru.academits.polyakova.vector.main;

import ru.academits.polyakova.vector.Vector;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        double[] array1 = new double[]{1, 2, 23};
        double[] array2 = new double[]{2, 54, 3};
        double[] array3 = new double[]{7, 5};
        Vector vector1 = new Vector(array1);
        Vector vector2 = new Vector(array2);
        int n = 3;
        Vector vector3 = new Vector(n, array3);
        System.out.print(vector1);
        System.out.println();
        System.out.print(vector3);
        System.out.println();
        System.out.println("Сумма векторов: " + Arrays.toString(vector1.sumVector(vector2)));
        System.out.println("Разность векторов: " + Arrays.toString(vector3.differenceVector(vector2)));
    }
}
