package com.course.datastructure.queue;

public class PriorityQueue<T> extends Queue<T>{

    @Override
    public void enqueue(T element) throws Exception {
        Comparable<T> comparable = (Comparable<T>) element;
        int i;
        for( i=0; i<this.element.length; i++ ){
            if(this.element[i] == null || comparable.compareTo(this.element[i]) < 0){
                break;
            }
        }
        this.add(element, i);
    }
}
