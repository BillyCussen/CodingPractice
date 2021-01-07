/*
Node.java
Billy Cussen
07/01/2021
*/
public class Node<T> {
    
    T element;
    Node<T> next;

    public Node(T element, Node<T> next){
        this.element = element;
        this.next = next;
    }

}
