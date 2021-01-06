/*
DLNode.java
Billy Cussen
06/01/2021
*/
public class DLNode<T>{

    T element;
    DLNode<T> previous;
    DLNode<T> successor;

    public DLNode(T element, DLNode<T> previous, DLNode<T> successor){
        this.element = element;
        this.previous = previous;
        this.successor = successor;
    }

}