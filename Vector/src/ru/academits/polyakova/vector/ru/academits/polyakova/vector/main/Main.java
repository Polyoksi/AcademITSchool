package ru.academits.polyakova.vector.ru.academits.polyakova.vector.main;

import ru.academits.polyakova.vector.Vector;


public class Main {
    public static void main(String[] args) {
        double[] array1 = new double[]{1, 2, 3};
        double[] array2 = new double[]{2, 54, 67};
        double[] array3 = new double[]{2, 5};
        Vector vector1 = new Vector(array1);
        Vector vector2 = new Vector(array2);
        int n = 3;
        Vector vector3 = new Vector(4, array3);
        System.out.print(vector1);
        System.out.println();
        System.out.print(vector3);
        // System.out.println("Сумма векторов: " + vector1.sumVector(vector2));
        //System.out.println("Разность векторов: " + vector1.differenceVector(vector2));
    }
}
