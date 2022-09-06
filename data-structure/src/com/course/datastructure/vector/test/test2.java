package com.course.datastructure.vector.test;

import com.course.datastructure.vector.Vector;

public class test2 {
    public static void main(String args []) throws Exception {
        Vector vector1 = new Vector(2);
        vector1.add("Element 1");
        vector1.add("Element 2");
        vector1.add("Element 3");
        try{
            System.out.println(vector1.searchBy(3));
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(vector1.searchBy("Element 3"));
        System.out.println(vector1.searchBy("Element 1"));
        System.out.println(vector1.searchBy("Element 2"));
        System.out.println(vector1.searchBy("element 2"));
    }
}
