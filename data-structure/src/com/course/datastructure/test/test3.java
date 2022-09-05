package com.course.datastructure.test;

import com.course.datastructure.vector.Vector;

public class test3 {
    public static void main(String args []) throws Exception {
        Vector vector1 = new Vector(10);
        vector1.add("Element 1");
        vector1.add("Element 2");
        vector1.add("Element 4");
        vector1.add("Element 5");
        vector1.add("Element 6");
        vector1.add("Element 7");
        vector1.add("Element 8");
        vector1.add("Element 9");

        vector1.add("Element 3", 2);
        System.out.println(vector1);


    }
}
