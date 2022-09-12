package com.course.datastructure.base;

public abstract class BaseDefault<T> {
    protected T[] element;
    protected int size;
    public BaseDefault(int capacity){
        this.element = (T[]) new Object[capacity];
        this.size = 0;
    }

    public BaseDefault(){
        this(10);
    }

    public int size(){
        return this.size;
    }

    public boolean isEmpty(){
        return this.size == 0;
    }
    private void changeCapacityVector(){
        if(this.size == this.element.length){
            T[] newVectorElement = (T[]) new Object[this.element.length * 2];
            for(int i=0; i<element.length; i++){
                newVectorElement[i] = this.element[i];
            }
            this.element = newVectorElement;
        }
    }

    protected boolean add(T element, int position) throws Exception {
        this.changeCapacityVector();
        if(position >=0 && position<=this.element.length){
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

    protected boolean add(T element){
        this.changeCapacityVector();
        if(this.size < this.element.length){
            this.element[this.size] = element;
            this.size++;
            return true;
        }
        return false;
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
    public int searchBy(T element){
        for(int i=0; i<this.size; i++){
            if(this.element[i].equals(element)) return i;
        }
        return -1;
    }
    public T searchBy(int position) throws Exception {
        if( position > 0 && position <= this.size){
            return this.element[position];
        }
        throw new Exception("This position does not exist");
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
