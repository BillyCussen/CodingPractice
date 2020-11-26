/*
BSTNode.java
Billy Cussen
26/11/2020
*/
public class BSTNode<T>{

    T element;
    BSTNode<T> left;
    BSTNode<T> right;

    public BSTNode(T element){
        this.element = element;
    }

    @Override
    public String toString(){
        String left = this.left == null ? "NULL" : this.left.element.toString();
        String right = this.right == null ? "NULL" : this.right.element.toString();
        return "Current: "+this.element+", Left: "+left+", Right: "+right;
    }

}