/*
BinarySearchTree.java
Billy Cussen
24/11/2020
*/
public class BinarySearchTree<T extends Comparable<T>> implements BinarySearchTreeInterface<T>{

    BSTNode<T> root;

    @Override
    public void insert(T element){
        if(isEmpty()){
            this.root = new BSTNode<T>(element);
        } else{
            insertHelper(element,this.root);
        }
    }

    private void insertHelper(T element, BSTNode<T> current){
        if(element.compareTo(current.element)==-1){
            if(current.left==null){
                current.left = new BSTNode<T>(element);
            } else{
                insertHelper(element,current.left);
            }
        } else{
            if(current.right==null){
                current.right= new BSTNode<T>(element);
            } else{
                insertHelper(element,current.right);
            }
        }
    }

    @Override
    public void inOrder(){
        if(isEmpty()){
            throw new NullPointerException("Can't do in order traversal, Binary Search Tree is Empty!");
        }
        System.out.println("***BINARY SEARCH TREE IN ORDER TRAVERSAL***"); 
        inOrderHelper(this.root);
        System.out.println("***END***");
    }

    private void inOrderHelper(BSTNode<T> current){
        if(current==null){
            return;
        }
        inOrderHelper(current.left);
        System.out.println(current.toString());
        inOrderHelper(current.right);
    }

    @Override
    public T getMax(){
        return null;
    }

    @Override 
    public T getMin(){
        return null;
    }

    @Override
    public T remove(T element){
        return null;
    }

    @Override
    public boolean isEmpty(){
        return this.root == null;
    }

    @Override
    public boolean contains(T element){
        return false;
    }

    @Override
    public int size(){
        if(isEmpty()){
            throw new NullPointerException("Can't get Size, Binary Search Tree is Empty!");
        }
        return sizeHelper(this.root);
    }

    private int sizeHelper(BSTNode<T> current){
        if(current==null){
            return 0;
        }
        return 1 + sizeHelper(current.left)+sizeHelper(current.right);
    }

    @Override
    public int depth(){
        return 0;
    }

} 