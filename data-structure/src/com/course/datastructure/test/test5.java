package com.course.datastructure.test;

import com.course.datastructure.vector.Vector;

public class test5 {

    public static void main(String args[]) throws Exception {
        Vector vector = new Vector(5);
        vector.add("Element A");
        vector.add("Element B");
        vector.add("Element C");
        vector.add("Element E");
        vector.add("Element F");
        System.out.println(vector);
        vector.remove(1);
        System.out.println(vector);


        Vector vector2 = new Vector(5);
        vector2.add("Element A");
        vector2.add("Element B");
        vector2.add("Element C");
        vector2.add("Element E");
        vector2.add("Element F");
        System.out.println(vector2);
        vector2.remove(5);
        System.out.println(vector2);

    }
}
