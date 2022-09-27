package com.course.datastructure.queue.test;

import java.util.PriorityQueue;
import java.util.Queue;

public class test2 {
    public static void main(String [] args){
        final Queue queue = new PriorityQueue();
        queue.add(10);
        queue.add(20);
        queue.add(100);
        queue.add(1);
        queue.add(2);
        queue.add(11);
        queue.add(3);
        queue.add(18);
        queue.add(4);
        queue.add(5);
        queue.add(1000);
        queue.add(6);
        queue.stream().forEach(System.out::println);
    }
}
