package com.course.datastructure.algorithms.sort;

public class QuickSort {
    public static void main(String args []) {
        int [] vector = new int[100];

        getPopulatedVector(vector);

        print(vector);

        quickSort(vector, 0, vector.length -1);

        print(vector);
    }

    private static void quickSort(int[] vector, int left, int right) {
      if(left < right){
          int p = partition(vector, left, right);
          quickSort(vector, left, p);
          quickSort(vector, p + 1, right);
      }
    }

    private static int partition(int[] vector, int left, int right){
        int half = (int) (left + right) /2;
        int pivot = vector[half];
        int i = left - 1;
        int j = right + 1;
        while (true){
            do{
                i++;
            }while (vector[i] < pivot);
            do{
                j--;
            }while (vector[j] > pivot);
            if (i > j) {
                return j;
            }
            int aux = vector[i];
            vector[i] = vector[j];
            vector[j] = aux;
        }
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
