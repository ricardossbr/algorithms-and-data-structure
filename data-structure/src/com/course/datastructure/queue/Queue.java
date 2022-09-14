package com.course.datastructure.queue;

import com.course.datastructure.base.BaseDefault;

public class Queue<T> extends BaseDefault {

    public T peek() {
        if(this.isEmpty()){
            return null;
        }
        return (T) this.element[0];
    }
}
