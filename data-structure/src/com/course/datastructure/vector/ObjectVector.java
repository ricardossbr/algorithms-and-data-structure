package com.course.datastructure.vector;

public class ObjectVector {
    private Object [] element;
    private int size;

    public ObjectVector(int capacity){
        this.element = new Object[capacity];
        this.size = 0;
    }

    public int getSize(){
        return this.size;
    }

    private void changeCapacityVector(){
        if(this.size == this.element.length){
            Object[] newVectorElement = new Object[this.element.length * 2];
            for(int i=0; i<element.length; i++){
                newVectorElement[i] = this.element[i];
            }
            this.element = newVectorElement;
        }

    }

    public boolean add(Object element){
        this.changeCapacityVector();
        if(this.size < this.element.length){
            this.element[this.size] = element;
            this.size++;
            return true;
        }
        return false;
    }

    //add element in any position... for this happen, it's necessary to move elements
    public boolean add(Object element, int position) throws Exception {
        this.changeCapacityVector();
        if(position >=0 && position<=this.element.length){
            //moving element
            for(int i = this.size -1; i >= position; i--){
                this.element[i+1] = this.element[i];
            }
            this.element[position] = element;
            this.size++;
            return true;
        }
        this.changeCapacityVector();
        throw new Exception("This position does not exist");
    }

    public Object searchBy(int position) throws Exception {
        if( position > 0 && position <= this.size){
            return this.element[position];
        }
        throw new Exception("This position does not exist");
    }

    public int searchBy(Object element){
        for(int i=0; i<this.size; i++){
            if(this.element[i].equals(element)) return i;
        }
        return -1;
    }

    public void remove(int position) throws Exception {
        if(position>=0 && position <= this.element.length){
            for(int i = position; i<this.size-1; i++){
                this.element[i] = this.element[i+1];
            }
            this.size--;
        }else{
            throw new Exception("This position does not exist");
        }
    }
    @Override
    public String toString() {
        final StringBuilder print = new StringBuilder();
        print.append("[");
        for(int i=0; i<this.size; i++){
            if(!(this.element[i] == null)){
                print.append(this.element[i]);
                if(i<(this.size -1 )) print.append(",");
            }
        }
        print.append("]");
        return print.toString();
    }
}
