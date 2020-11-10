/*
Node.java
Billy Cussen
10/11/2020
*/
public class Node<T>{

    T element;
    Node<T> next;

    public Node(T element){
        this.element = element;
    }

    public Node(T element, Node<T> next){
        this.element = element;
        this.next = next;
    }
}