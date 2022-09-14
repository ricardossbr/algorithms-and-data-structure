package com.course.datastructure.queue.test;


import com.course.datastructure.queue.Queue;

public class test {
    public static void main(String [] args) throws Exception {
        Queue<Integer> queue = new Queue();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
    }
}
