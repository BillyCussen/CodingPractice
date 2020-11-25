/*
BinarySearchTree.java
Billy Cussen
24/11/2020 - Updated on 25/11/2020
*/
public class BinarySearchTree<T extends Comparable<T>> implements BinarySearchTreeInterface<T>{

    BSTNode<T> root;

    @Override
    public void insert(T elem){
        if(isEmpty()){
            this.root = new BSTNode<T>(elem);
        } else{
            insertHelper(elem, this.root);
        }
    }

    private void insertHelper(T elem, BSTNode<T> current){
        if(elem.compareTo(current.element) == -1){
            if(current.left==null){
                current.left = new BSTNode<T>(elem);
            } else{
                insertHelper(elem,current.left);
            }
        } else{
            if(current.right==null){
                current.right = new BSTNode<T>(elem);
            } else{
                insertHelper(elem,current.right);
            }
        }
    }

    @Override
    public void inOrder(){
        if(isEmpty()){
            throw new NullPointerException("Can't do in order traversal, the BST is Empty!");
        } else{
            System.out.println("***BINARY SEARCH TREE IN ORDER TRAVERSAL***");
            inOrderHelper(this.root);
            System.out.println("***END***");
        }
    }

    private void inOrderHelper(BSTNode<T> current){
        if(current == null){
            return;
        } else{
            inOrderHelper(current.left);
            System.out.println(current);
            inOrderHelper(current.right);
        }
    }

    @Override
    public boolean isEmpty(){
        return this.root == null;
    }

    @Override
    public int size(){
        if(isEmpty()){
            throw new NullPointerException("Can't get Size, BST is Empty!");
        } else{
            return sizeHelper(this.root);
        }
    }

    private int sizeHelper(BSTNode<T> current){
        if(current==null){
            return 0;
        } 
        return 1 + sizeHelper(current.left)+sizeHelper(current.right);
    }

    @Override
    public T getMin(){
        if(isEmpty()){
            throw new NullPointerException("Can't get Min, BST is Empty!");
        }
        return getMinHelper(this.root);
    }

    private T getMinHelper(BSTNode<T> current){
        if(current.left==null){
            return current.element;
        }
        return getMinHelper(current.left);
    }

    @Override
    public T getMax(){
        if(isEmpty()){
            throw new NullPointerException("Can't get Max, BST is Empty!");
        }
        return getMaxHelper(this.root);
    }

    private T getMaxHelper(BSTNode<T> current){
        if(current.right == null){
            return current.element;
        }
        return getMaxHelper(current.right);
    }

    @Override
    public int getDepth(){
        if(isEmpty()){
            throw new NullPointerException("Can't get Depth, BST is Empty!");
        }
        return getDepthHelper(this.root);
    }

    private int getDepthHelper(BSTNode<T> current){
        if(current==null){
            return 0;
        }

        int left = getDepthHelper(current.left);
        int right = getDepthHelper(current.right);

        if(left>right){
            return 1 + left;
        } else{
            return 1 + right;
        }
    }

    @Override
    public T remove(T element){
        return null;
    }

    @Override
    public boolean contains(T element){
        if(isEmpty()){
            throw new NullPointerException("Can't locate "+element+", the BST is empty!");
        } 
        return containsHelper(this.root,element);
    }

    private boolean containsHelper(BSTNode<T> current, T element){
        if(current == null){
            return false;
        }

        if(element.compareTo(current.element) == 0){
            return true;
        } else if (element.compareTo(current.element) == -1){
            return containsHelper(current.left, element);
        } else{
            return containsHelper(current.right,element);
        }
    }

}