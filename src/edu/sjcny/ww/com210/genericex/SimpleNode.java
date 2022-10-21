package edu.sjcny.ww.com210.genericex;

/**
 * This class defines an object meant to be used generically
 * by various data structures. A node is an element of a list,
 * tree, or other type of <B>GRAPH based data structures</B>
 */

public class SimpleNode <T> {
    /**
     * Our default constructor
     */
    SimpleNode(){};

    SimpleNode(T input){
        data = input;
    };

    public T getElement(){
        return data;
    }

    public void setElement(T data){
        this.data= data;
    }

    T data;

}
