package com.course.datastructure.vector;

import com.course.datastructure.base.BaseDefault;

public class GenericsVector<T> extends BaseDefault {

    public GenericsVector(int capacity){
       super(capacity);
    }

    public GenericsVector(){
        super();
    }
    public Object searchBy(int position) throws Exception {
        if( position > 0 && position <= super.size){
            return super.element[position];
        }
        throw new Exception("This position does not exist");
    }

    @Override
    public boolean add(Object element, int position) throws Exception {
        return super.add(element, position);
    }

    @Override
    public boolean add(Object element){
        return super.add(element);
    }
}
