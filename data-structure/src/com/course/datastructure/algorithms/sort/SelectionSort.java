package com.course.datastructure.algorithms.sort;

public class SelectionSort {
    public static void main(String args []) {
        int [] vector = new int[10 ];

        getPopulatedVector(vector);
        print(vector);

        int aux, smaller;
        for(int i=0; i < vector.length; i++){
            smaller = i;
            for(int j = i+1; j < vector.length; j++){
                if(vector[j] < vector[smaller]){
                    smaller = j;
                }
            }
            aux = vector[smaller];
            vector[smaller] = vector[i];
            vector[i] = aux;
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
