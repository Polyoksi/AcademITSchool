package ru.academits.polyakova.vector;

import javafx.beans.binding.StringBinding;

import java.util.Arrays;

public class Vector {
    private double[] vector;

    public Vector(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException();
        }
        vector = new double[n];
    }

    public Vector(Vector vector) {
        this.vector = vector.vector;
    }

    public Vector(double[] vector) {
        this.vector = vector;
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

}
/*
    public Vector sumVector(Vector vector2) {
        for (int i = 0; i < this.vector.length; i++) {
            result.getVector()[i] = this.vector[i] + vector2.getVector()[i];
        }
        return vector;
    }
/*
    public Vector differenceVector(Vector vector2) {
        Vector result = new Vector();
        for (int i = 0; i < this.vector.length; i++) {
            result.getVector()[i] = this.vector[i] - vector2.getVector()[i];
        }
        return result;
    }
}*/
