/*
BST.java
Billy Cussen
18/01/2021
*/
public class BST<T extends Comparable<T>>{

    Node<T> root;

    public void insert(T element){
        if(isEmpty()){
            this.root = new Node<T>(element);
        } else{
            insertHelper(element, this.root);
        }
    }

    private void insertHelper(T element, Node<T> current){
        if(element.compareTo(current.element)==-1){
            if(current.left == null){
                current.left = new Node<T>(element);
            } else{
                insertHelper(element, current.left);
            }
        } else{
            if(current.right == null){
                current.right = new Node<T>(element);
            } else{
                insertHelper(element, current.right);
            }
        }
    }

    public int size(){
        if(isEmpty()){
            return 0;
        }
        return sizeHelper(this.root);
    }

    private int sizeHelper(Node<T> current){
        if(current == null){
            return 0;
        }
        return 1 + sizeHelper(current.left)+sizeHelper(current.right);
    }

    public T min(){
        if(isEmpty()){
            throw new NullPointerException("Can't get Min, BST is Empty!");
        } 
        return minHelper(this.root);
    }

    private T minHelper(Node<T> current){
        if(current == null){
            return null;
        }

        if(current.left == null){
            return current.element;
        } else{
            return minHelper(current.left);
        }
    }

    public T max(){
        if(isEmpty()){
            throw new NullPointerException("Can't get Max, BST is Empty!");
        }
        return maxHelper(this.root);
    }

    private T maxHelper(Node<T> current){
        if(current == null){
            return null;
        }

        if(current.right == null){
            return current.element;
        } else{
            return maxHelper(current.right);
        }
    }

    public int depth(){
        if(isEmpty()){
            return 0;
        }
        return depthHelper(this.root);
    }

    private int depthHelper(Node<T> current){
        if(current==null){
            return 0;
        }

        int leftSide = 1 + depthHelper(current.left);
        int rightSide = 1 + depthHelper(current.right);
        if(leftSide>=rightSide){
            return leftSide;
        } else{
            return rightSide;
        }
    }

    public String inOrder(){
        if(isEmpty()){
            throw new NullPointerException("Can't do in order Traversal, BST is Empty!");
        }
        String result = "***BST IN ORDER TRAVERSAL***\n";
        result += inOrderHelper(this.root);
        result += "***END***\n";
        return result;
    }

    private String inOrderHelper(Node<T> current){
        String result = "";
        if(current == null){
            return "";
        }

        result+=inOrderHelper(current.left);
        result+=current.toString()+"\n";
        result+=inOrderHelper(current.right);
        return result;
    }

    public boolean isEmpty(){
        return this.root == null;
    }

}