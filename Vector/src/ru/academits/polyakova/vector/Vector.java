package ru.academits.polyakova.vector;
import java.util.ArrayList;

public class Vector {
    private int n = 0;
    ArrayList<Double> vector = new ArrayList<>(n);
    public Vector(int n){
        this.n = n;
    }

    public Vector(ArrayList<Double> vector){
        this.vector = vector;
    }

    public Vector(double[] array){
        for(int i = 0; i < vector.size(); i++){
            double elem = vector.get(i);
            elem = array[i];
        }
    }

    public Vector(int n, double[] array){
        for(int i = 0; i < vector.size(); i++){
            double elem = vector.get(i);
            elem = array[i];
        }
        if(array.length < n){
            for(int i = array.length; i < vector.size(); i++){
                double elem = vector.get(i);
                elem = 0;
            }
        }
    }

    public static int getSize(ArrayList<Double> vector){
        return vector.size();

    }

    public String toString(ArrayList<Double> vector){
        String result = "";
        for(int i = 0; i < vector.size(); i++){
            result += vector.get(i) + ", ";
        }
        return result;
    }
}
