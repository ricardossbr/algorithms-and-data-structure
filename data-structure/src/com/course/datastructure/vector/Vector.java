package com.course.datastructure.vector;

public class Vector {

    private String [] element;
    private int size;

    public Vector(int capacity){
        this.element = new String[capacity];
        this.size = 0;
    }

    public int getSize(){
        return this.size;
    }

    // wrong way to implement this code... because it´s expend a lot off memory for add
    /*public void add(String element){
        for(int i=0; i<this.element.length; i++){
            if(this.element[i] == null){
                this.element[i] = element;
                break;
            }
        }
    }*/

    // possible way to implement... with throws exception.
    /*  public void add(String element) throws Exception {
        if(this.size < this.element.length){
            this.element[this.size] = element;
            this.size++;
        }else {
            throw new Exception("This Vector is full, is not possible to add more element!");
        }
     }*/

    public boolean add(String element){
        if(this.size < this.element.length){
            this.element[this.size] = element;
            this.size++;
            return true;
        }
        return false;
    }

    //add element in any position... for this happen, it's necessary to move elements
    public boolean add(String element, int position) throws Exception {
        if(position >=0 && position<=this.element.length){
            //moving element
            for(int i = this.size -1; i >= position; i--){
                this.element[i+1] = this.element[i];
            }
            this.element[position] = element;
            this.size++;
            return true;
        }
        throw new Exception("This position does not exist");

    }

    public String searchBy(int position) throws Exception {
        if( position > 0 && position <= this.size){
            return this.element[position];
        }
        throw new Exception("This position does not exist");
    }

    //possible way...
   /* public boolean searchBy(String element) {
        for(int i=0; i<this.size; i++){
            if(this.element[i].equals(element)) return true;
        }
        return false;
    }*/
    public int searchBy(String element){
        for(int i=0; i<this.size; i++){
            if(this.element[i].equals(element)) return i;
        }
        return -1;
    }
    @Override
    public String toString() {
        final StringBuilder print = new StringBuilder();
        print.append("[");
        for(int i=0; i<this.element.length; i++){
            if(!(this.element[i] == null)){
                print.append(this.element[i]);
                if(i<(this.size -1 )) print.append(",");
            }
        }
        print.append("]");
        return print.toString();
    }
}
