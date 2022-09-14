package com.course.datastructure.queue;

import com.course.datastructure.base.BaseDefault;

public class Queue<T> extends BaseDefault {

    public boolean add(Object element){
        return super.add(element);
    }

    public T remove() throws Exception {
        if(this.isEmpty()){
            return null;
        }
        final T elementOld = (T) this.element[0];
        this.remove(0);
        return elementOld;
    }

    public T peek() {
        if(this.isEmpty()){
            return null;
        }
        return (T) this.element[0];
    }
}
