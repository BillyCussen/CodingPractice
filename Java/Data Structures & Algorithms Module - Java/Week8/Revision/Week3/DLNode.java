/*
DLNode.java
Billy Cussen
11/11/2020
*/
public class DLNode<T>{

    T element;
    DLNode<T> previous;
    DLNode<T> successor;

    public DLNode(T element){
        this.element = element;
        this.previous = null;
        this.successor = null;
    }

    public DLNode(T element, DLNode<T> previous, DLNode<T> successor){
        this.element = element;
        this.previous = previous;
        this.successor = successor;
    }

}