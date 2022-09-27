package com.course.datastructure.stack;

import com.course.datastructure.base.BaseDefault;

public class GenericStack<T> extends BaseDefault {

    public GenericStack(int capacity){
        super(capacity);
    }

    public GenericStack(){ super(); }

    public boolean push(T element, int position) throws Exception {
        return super.add(element, position);
    }

    public boolean push(T element){
        return super.add(element);
    }

    public T pop(){
        if(this.isEmpty()) return null;
        return  (T) this.element[--this.size];
    }

    public T peek() {
        if(this.isEmpty()){
            return null;
        }
        return (T) this.element[this.size -1];
    }

}
