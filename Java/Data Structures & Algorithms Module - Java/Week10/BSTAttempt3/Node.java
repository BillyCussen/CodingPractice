/*
Node.java
Billy Cussen
28/11/2020
*/
public class Node<T>{

    T element;
    Node<T> left;
    Node<T> right;

    public Node(T element){
        this.element = element;
    }

    @Override
    public String toString(){
        String left = this.left == null ? "NULL" : this.left.element.toString();
        String right = this.right == null ? "NULL" : this.right.element.toString();
        return "Current: "+this.element+", Left: "+left+", Right: "+right;
    }

}