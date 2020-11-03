/*
Node.java
Billy Cussen
09/09/2020
*/

public class Node<T>{

    //Data Members
    T element;
    Node<T> next;

    //Constructors
    public Node(T element, Node<T> next){
        this.element = element;
        this.next = next;
    }

    public Node(T element){
        this.element = element;
    }

    @Override
    public String toString(){
        return (String)this.element;
    }

}