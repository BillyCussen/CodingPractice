/*
Node.java
Billy Cussen
25/01/2021
*/
public class Node<T>{
    
    T element;
    Node<T> left;
    Node<T> right;

    public Node(T element){
        this.element = element;
        this.left = null;
        this.right = null;
    }

    @Override
    public String toString(){
        String leftNode = this.left == null ? "NULL" : this.left.element.toString();
        String rightNode = this.right == null ? "NULL" : this.right.element.toString();
        return "Element: "+this.element+", Left: "+leftNode+", Right: "+rightNode;
    }

}
