/*
DLLNode.java
Billy Cussen
11/09/2020
*/

public class DLLNode<T>{

    T element;
    DLLNode<T> previous;
    DLLNode<T> successor;

    public DLLNode(T element){
        this.element = element;
    }

    public DLLNode(T element, DLLNode<T> previous, DLLNode<T> successor){
        this.element = element;
        this.previous = previous;
        this.successor = successor;
    }

}