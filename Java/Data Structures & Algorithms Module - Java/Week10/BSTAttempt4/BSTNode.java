/*
BSTNode.java
Billy Cussen
07/12/2020
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
        String leftNode = this.left == null ? "NULL" : this.left.element.toString();
        String rightNode = this.right == null ? "NULL" : this.right.element.toString();
        return "Current: "+this.element+", Left: "+leftNode+", Right: "+rightNode+".";
    }

}