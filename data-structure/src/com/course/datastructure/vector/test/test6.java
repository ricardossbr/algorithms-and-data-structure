package com.course.datastructure.vector.test;

import com.course.datastructure.vector.ObjectVector;

import java.math.BigDecimal;
import java.util.*;

public class test6 {

    public static void main(String args[]) throws Exception {
        ObjectVector vector = new ObjectVector(10);
        vector.add(10);
        vector.add(11);
        vector.add(101);
        vector.add(1001);
        vector.add(10001);
        System.out.println("Vector Size:" + vector.getSize());
        System.out.println(vector);


        ObjectVector vector2 = new ObjectVector(10);
        final List<Integer> numberList = Arrays.asList(10, 11, 12, 13, 14);
        final Set<String> stringSet = Set.of("A", "B", "C", "D", "E");
        final Map<String, String> elementMapper = Map.of("Element1", "Element", "Element2", "Element2");
        vector2.add(numberList);
        vector2.add(stringSet);
        vector2.add(elementMapper);
        vector2.add(new BigDecimal(10001));
        vector2.add(new String("test my generic vector, seems to be ok!"));
        System.out.println("Vector Size:" + vector2.getSize());
        System.out.println(vector2);
        System.out.println(vector2.searchBy(numberList));
        System.out.println(vector2.searchBy(elementMapper));
        vector2.remove(0);

        System.out.println(vector2);
    }
}
