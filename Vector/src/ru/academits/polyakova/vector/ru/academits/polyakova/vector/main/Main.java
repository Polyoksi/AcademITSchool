package ru.academits.polyakova.vector.ru.academits.polyakova.vector.main;

import ru.academits.polyakova.vector.Vector;


public class Main {
    public static void main(String[] args) {
        double[] array = new double[]{1, 2, 3, 4, 60};
        Vector vector = new Vector(array);
        System.out.print(vector.toString());

    }
}
