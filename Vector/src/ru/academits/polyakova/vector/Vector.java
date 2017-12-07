package ru.academits.polyakova.vector;

import java.util.Arrays;

public class Vector {
    private double[] vector;

    private Vector(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException();
        }
        vector = new double[n];
    }

    public Vector(Vector vector) {
        this.vector = Arrays.copyOf(vector.vector, vector.getSize());
    }

    public Vector(double[] vector) {
        this.vector = Arrays.copyOf(vector, vector.length);
    }

    public Vector(int n, double[] array) {
        vector = Arrays.copyOf(array, n);
    }

    private int getSize() {
        return vector.length;
    }

    public String toString() {
        StringBuilder result = new StringBuilder("{");
        for (int i = 0; i < vector.length; i++) {
            if (i == vector.length - 1) {
                result.append(vector[i]);
                break;
            }
            result.append(vector[i]);
            result.append(", ");
        }
        result.append("}");
        return result.toString();
    }

    public void sum(Vector vector2) {
        if (vector.length < vector2.getSize()) {
            vector = Arrays.copyOf(vector, vector2.getSize());
        }
        for (int i = 0; i < vector2.getSize(); i++) {
            vector[i] = vector[i] + vector2.vector[i];
        }
    }

    public void dif(Vector vector2) {
        if (vector.length < vector2.getSize()) {
            vector = Arrays.copyOf(vector, vector2.getSize());
        }
        for (int i = 0; i < vector2.getSize(); i++) {
            vector[i] = vector[i] - vector2.vector[i];
        }
    }

    public void multiplication(double number) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] *= number;
        }
    }

    public void turn() {
        multiplication(-1);
    }

    public void setItemIndex(double number, int index){
        vector[index] = number;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }
        boolean result = false;
        if (((Vector) o).getSize() == this.getSize()) {
            for (int i = 0; i < ((Vector) o).getSize(); i++) {
                if (((Vector) o).vector[i] == this.vector[i]) {
                    result = true;
                } else {
                    return false;
                }
            }
        }
        return result;
    }

    public int hashCode() {
        final int prime = 7;
        int hash = 1;
        return prime * hash + Arrays.hashCode(vector);
    }

    public static Vector sumVector(Vector vector1, Vector vector2) {
        Vector result = new Vector(Math.max(vector1.getSize(), vector2.getSize()));
        result.vector = Arrays.copyOf(vector1.vector, vector1.getSize());
        result.sum(vector2);
        return result;
    }

    public static Vector difVector(Vector vector1, Vector vector2) {
        Vector result = new Vector(Math.max(vector1.getSize(), vector2.getSize()));
        result.vector = Arrays.copyOf(vector1.vector, vector1.getSize());
        result.dif(vector2);
        return result;
    }

    public static double scalarMultiplication(Vector vector1, Vector vector2) {
        double result = 0;
        for (int i = 0; i < Math.min(vector1.getSize(), vector2.getSize()); i++) {
            result += vector1.vector[i] * vector2.vector[i];
        }
        return result;
    }
}
