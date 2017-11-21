package ru.academits.polyakova.vector;

public class Vector {

    private double[] vector;

    private Vector(){
        this.vector = vector;
    }

    private double[] getVector(){
        return vector;
    }

    public Vector(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException();
        }
        vector = new double[n];
    }

    public Vector(Vector array) {
        for (int i = 0; i < array.getSize(); i++) {
           vector[i] = array.getVector()[i];
        }
    }

    public Vector(double[] array) {
        for (int i = 0; i < array.length; i++) {
            double elem = array[i];
            vector[i] = elem;
        }
    }

    public Vector(int n, double[] array) {
        for (int i = 0; i < array.length; i++) {
            double elem = array[i];
            vector[i] = elem;
        }
        if (array.length < n) {
            for (int i = array.length; i < vector.length; i++) {
                vector[i] = 0;
            }
        }
    }

    private int getSize() {
        return vector.length;

    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < vector.length; i++) {
            result.append(vector[i]);
            if (i != vector.length) {
                result.append(", ");
            }
        }
        result.insert(0, "{");
        result.append("}");
        return result.toString();
    }

    public Vector sumVector(Vector vector2) {
        Vector result = new Vector();
        for (int i = 0; i < this.vector.length; i++) {
            result.getVector()[i] = this.vector[i] + vector2.getVector()[i];
        }
        return result;
    }

    public Vector differenceVector(Vector vector2) {
        Vector result = new Vector();
        for (int i = 0; i < this.vector.length; i++) {
            result.getVector()[i] = this.vector[i] - vector2.getVector()[i];
        }
        return result;
    }
}
