package com.course.datastructure.algorithms.sort;

public class BubbleSort {
    public static void main(String args []) {
        int [] vector = new int[100];

        getPopulatedVector(vector);

        print(vector);

        int aux;
        for (int i=0; i < vector.length; i++){
            for (int j = i + 1; j < vector.length; j++){
                if(vector[i] > vector[j]){
                    aux = vector[i];
                    vector[i] = vector[j];
                    vector[j] = aux;
                }
            }
        }

        print(vector);
    }

    private static void getPopulatedVector(int[] vector) {
        for(int i = 0; i < vector.length; i++){
            vector[i] = (int) (Math.random() * vector.length);
        }
    }

    private static void print(int[] vetor) {
        for(int i = 0; i < vetor.length; i++){
            if(i == 0) System.out.print("[");
            System.out.print(vetor[i]);
            if(i == (vetor.length -1)) {
                System.out.println("]");
            }else {
                System.out.print(",");
            }
        }
    }
}
