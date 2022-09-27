package com.course.datastructure.queue.test;


import com.course.datastructure.queue.PriorityQueue;
import com.course.datastructure.queue.Queue;

import java.util.LinkedList;

public class test {
    public static void main(String [] args) throws Exception {
        Queue<Integer> queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);



        final PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
        priorityQueue.enqueue(10);
        priorityQueue.enqueue(20);
        priorityQueue.enqueue(100);
        priorityQueue.enqueue(1);
        priorityQueue.enqueue(2);
        priorityQueue.enqueue(11);
        priorityQueue.enqueue(3);
        priorityQueue.enqueue(18);
        priorityQueue.enqueue(4);
        priorityQueue.enqueue(5);
        priorityQueue.enqueue(1000);
        priorityQueue.enqueue(6);
        System.out.println(priorityQueue);
    }
}
