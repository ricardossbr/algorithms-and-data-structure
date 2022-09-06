package com.course.datastructure.vector.test;

import com.course.datastructure.vector.Vector;

public class test3 {
    public static void main(String args []) throws Exception {
       /* Vector vector1 = new Vector(10);
        vector1.add("Element 1");
        vector1.add("Element 2");
        vector1.add("Element 4");
        vector1.add("Element 5");
        vector1.add("Element 6");
        vector1.add("Element 7");
        vector1.add("Element 8");
        vector1.add("Element 9");

        vector1.add("Element 3", 2);
        System.out.println(vector1);*/

        Vector vector2 = new Vector(12);
        vector2.add("Element B");
        vector2.add("Element C");
        vector2.add("Element E");
        vector2.add("Element F");
        vector2.add("Element G");
        vector2.add("Element I");
        vector2.add("Element J");
        vector2.add("Element L");

        System.out.println(vector2);
        vector2.add("Element A", 0);
        System.out.println(vector2);

        vector2.add("Element D", 3);
        System.out.println(vector2);

        vector2.add("Element H", 7);
        System.out.println(vector2);


    }
}
