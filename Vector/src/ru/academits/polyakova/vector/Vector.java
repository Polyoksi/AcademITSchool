package ru.academits.polyakova.vector;

public class Vector {

    private double[] vector = new double[]{};

    public Vector(int n){
        if(n <= 0){
            throw new IllegalArgumentException();
        }
        vector = new double[n];
    }

    public Vector(Vector array){

        for(int i = 0; i < array.getSize(); i++){
            //vector[i] = (double) array[i];
        }
    }

    public Vector(double[] array){
        for(int i = 0; i < vector.length; i++){
            double elem = array[i];
            vector[i] = elem;
        }
    }

    public Vector(int n, double[] array){
        for(int i = 0; i < vector.length; i++){
            double elem = array[i];
            vector[i]=elem;
        }
        if(array.length < n){
            for(int i = array.length; i < vector.length; i++){
                vector[i] = 0;
            }
        }
    }

    public int getSize(){
        return vector.length;

    }

    public String toString(){
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < vector.length; i++){
            result.append(vector[i]);
            if(i != vector.length){
                result.append(", ");
            }
        }
        return "{"  + result.toString() + "}";
    }
}
