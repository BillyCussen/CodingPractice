/*
BST.java
Billy Cussen
27/01/2021
*/

public class BST<T extends Comparable<T>> {
    
    Node<T> root;

    public BST(){
        this.root = null;
    }

    public boolean isEmpty(){
        return this.root == null;
    }

    public int size(){
        if(isEmpty()){
            return 0;
        }
        return sizeHelper(this.root);
    }

    private int sizeHelper(Node<T> current){
        if(current==null){
            return 0;
        }
        return 1 + sizeHelper(current.left)+sizeHelper(current.right);
    }

    public void insert(T element){
        if(isEmpty()){
            this.root = new Node<T>(element);
        } else{
            insertHelper(this.root, element);
        }
    }

    private void insertHelper(Node<T> current, T element){
        if(element.compareTo(current.element)==-1){
            if(current.left == null){
                current.left = new Node<T>(element);
            } else{
                insertHelper(current.left, element);
            }
        } else{
            if(current.right == null){
                current.right = new Node<T>(element);
            } else{
                insertHelper(current.right,element);
            }
        }
    }

    public void inOrder(){
        if(isEmpty()){
            System.out.println("Can't do in order traversal, BST is Empty!");
        } else{
            System.out.println("***Bst In Order Traversal***");
            inOrderHelper(this.root);
            System.out.println("***END***");
        }
    }

    private void inOrderHelper(Node<T> current){
        if(current==null){
            return;
        }
        inOrderHelper(current.left);
        System.out.println(current.toString());
        inOrderHelper(current.right);
    }

    public Node<T> findNode(T element){
        if(isEmpty()){
            return null;
        }
        return findNodeHelper(this.root, element);
    }

    private Node<T> findNodeHelper(Node<T> current, T element){
        if(current == null){
            return null;
        }

        if(element.compareTo(current.element)==0){
            return current;
        } else if(element.compareTo(current.element)==-1){
            return findNodeHelper(current.left, element);
        } else{
            return findNodeHelper(current.right, element);
        }
    }

    public Node<T> findParent(T element){
        if(isEmpty() || element.compareTo(this.root.element)==0){
            return null;
        }
        return findParentHelper(this.root, element);
    }

    private Node<T> findParentHelper(Node<T> current, T element){
        if(element.compareTo(current.element)==-1){
            if(current.left == null){
                return null;
            } else if(element.compareTo(current.left.element)==0){
                return current;
            } else{
                return findParentHelper(current.left, element);
            }
        } else{
            if(current.right == null){
                return null;
            } else if(element.compareTo(current.right.element)==0){
                return current;
            } else{
                return findParentHelper(current.right, element);
            }
        }
    }

}
