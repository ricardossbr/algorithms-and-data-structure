package com.course.datastructure.vector.test;

import com.course.datastructure.vector.GenericsVector;

public class Test7 {
    public static void main(String args[]) throws Exception {
        GenericsVector<String> genericString = new GenericsVector<>(10);
        genericString.add("A");
        genericString.add("C");
        genericString.add("D");
        genericString.add("E");
        genericString.add("F");
        genericString.add("G");
        genericString.add("H");
        System.out.println(genericString);
        genericString.add("B", 1);
        System.out.println(genericString);
        genericString.remove(6);
        System.out.println(genericString);
        System.out.println(genericString.searchBy("H"));
    }
}
