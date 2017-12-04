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

    public double[] sum(Vector vector2) {
        if (vector.length < vector2.getSize()) {
            vector = Arrays.copyOf(vector, vector2.getSize());
        } else {
            vector2.vector = Arrays.copyOf(vector2.vector, vector.length);
        }
        for (int i = 0; i < vector.length; i++) {
            vector[i] = vector[i] + vector2.vector[i];
        }
        return vector;
    }

    public double[] dif(Vector vector2) {
        if (vector.length < vector2.getSize()) {
            vector = Arrays.copyOf(vector, vector2.getSize());
        } else {
            vector2.vector = Arrays.copyOf(vector2.vector, vector.length);
        }
        for (int i = 0; i < vector.length; i++) {
            vector[i] = vector[i] - vector2.vector[i];
        }
        return vector;
    }

    public double[] multiplication(double number) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] *= number;
        }
        return vector;
    }

    public double[] turn() {
        for (int i = 0; i < vector.length; i++) {
            vector[i] *= -1;
        }
        return vector;
    }

    public static Vector sumVector(Vector vector1, Vector vector2) {
        Vector result = new Vector(Math.max(vector1.getSize(), vector2.getSize()));
        if (vector1.getSize() < vector2.getSize()) {
            vector1.vector = Arrays.copyOf(vector1.vector, vector2.getSize());
        } else {
            vector2.vector = Arrays.copyOf(vector2.vector, vector1.getSize());
        }
        for (int i = 0; i < vector1.getSize(); i++) {
            result.vector[i] = vector1.vector[i] + vector2.vector[i];
        }
        return result;
    }

    public static Vector difVector(Vector vector1, Vector vector2) {
        Vector result = new Vector(Math.max(vector1.getSize(), vector2.getSize()));
        if (vector1.getSize() < vector2.getSize()) {
            vector1.vector = Arrays.copyOf(vector1.vector, vector2.getSize());
        } else {
            vector2.vector = Arrays.copyOf(vector2.vector, vector1.getSize());
        }
        for (int i = 0; i < vector1.getSize(); i++) {
            result.vector[i] = vector1.vector[i] - vector2.vector[i];
        }
        return result;
    }

    public static double scalarMultiplication(Vector vector1, Vector vector2){
        double result = 0;
        if (vector1.getSize() < vector2.getSize()) {
            vector1.vector = Arrays.copyOf(vector1.vector, vector2.getSize());
        } else {
            vector2.vector = Arrays.copyOf(vector2.vector, vector1.getSize());
        }
        for (int i = 0; i < vector1.getSize(); i++) {
            result +=  vector1.vector[i] * vector2.vector[i];
        }
        return result;
    }
}
