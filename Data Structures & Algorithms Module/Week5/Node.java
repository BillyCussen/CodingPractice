/*
Node.java
Billy Cussen
29/09/2020
*/

public class Node<T>{

    Node<T> next;
    T element;

    public Node(T element, Node<T> next){
        this.element = element;
        this.next = next;
    }
}