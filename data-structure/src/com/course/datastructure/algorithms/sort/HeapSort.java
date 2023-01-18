package com.course.datastructure.algorithms.sort;

public class HeapSort {
    public static void main(String args []) {
        int [] vector = new int[10];

        getPopulatedVector(vector);
        print(vector);

        int size = vector.length;
        for (int i = ((size / 2) -1); i >=0; i-- ){
            applyHeap(vector, size, i);
        }
        System.out.println("partial sort!");
        print(vector);
        for (int j = size - 1; j > 0; j-- ){
            int aux = vector[0];
            vector[0] = vector[j];
            vector[j] = aux;
            applyHeap(vector, j, 0);
        }
        System.out.println("Ordered!");
        print(vector);

    }

    private static void applyHeap(int[] vector, int size, int element){
        int node = element;
        int left = 2*element+1;
        int right = 2*element+2;

        if(left < size && vector[left] > vector[node]){
            node = left;
        }
        if(right < size && vector[right] > vector[node]){
            node = right;
        }
        if(node !=element){
            int aux = vector[element];
            vector[element] = vector[node];
            vector[node] =aux;
            applyHeap(vector, size, node);
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
