package com.course.datastructure.algorithms.sort;



public class InsertionSort {
    public static void main(String args []) {
        int [] vector = new int[100];

        getPopulatedVector(vector);

        print(vector);

        int aux, j;
        for (int i=1; i < vector.length; i++){
            aux = vector [i];
            j = i -1;
           while (j >= 0 && vector[j] > aux){
               vector[j+1] = vector[j];
                j--;
           }
            vector[j+1] = aux;
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
