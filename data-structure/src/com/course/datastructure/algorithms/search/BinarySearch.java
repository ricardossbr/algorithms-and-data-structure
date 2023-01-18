package com.course.datastructure.algorithms.search;

import java.util.Scanner;

public class  BinarySearch {
    public static void main(String args []) {
        int[] vector = new int[100];

        getPopulatedVector(vector);
        print(vector);

        System.out.println("please, enter the number to search");
        int fetched = 1;
        boolean found = false;
        int start = 0;
        int end = vector.length -1;
        int half;
        while (start <= end){
            half = (int) ((start + end) /2);
            if(vector[half] == fetched){
                found = true;
                break;
            }else if(vector[half] < fetched){
                start = half + 1;
            }else {
                end = half - 1;
            }
        }
        if(found){
            System.out.println("The number: "+ fetched + " to search is present!");
        }else {
            System.out.println("The number: "+ fetched + " to search is not fetched!"  );
        }



    }
    private static void getPopulatedVector(int[] vector) {
        for(int i = 0; i < vector.length; i++){
            vector[i] = i *2;
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
