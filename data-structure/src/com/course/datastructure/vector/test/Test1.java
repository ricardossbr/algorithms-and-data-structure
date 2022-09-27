package com.course.datastructure.vector.test;

import com.course.datastructure.vector.Vector;

public class Test1 {

    public static void main(String args []) {
        Vector vector1 = new Vector(2);
        vector1.add("Element 1");
        vector1.add("Element 2");
        vector1.add("Element 3");
        System.out.println(vector1.getSize());
        System.out.println(vector1);
    }
}
