/*
Node.java
Billy Cussen
01/10/2020
*/

public class Node<T>{
    //Data Members
    T element;
    Node<T> next;

    //Constructor
    public Node(T element, Node<T> next){
        this.element = element;
        this.next = next;
    }
}