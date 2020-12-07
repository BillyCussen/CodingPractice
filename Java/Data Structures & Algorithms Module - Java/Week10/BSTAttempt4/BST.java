/*
BST.java
Billy Cussen
07/12/2020
*/
public class BST<T extends Comparable<T>> implements BSTInterface<T>{

    BSTNode<T> root;

    @Override
    public void insert(T element){
        if(isEmpty()){
            this.root = new BSTNode<T>(element);
        } 
        insertHelper(this.root, element);
    }

    private void insertHelper(BSTNode<T> current, T element){
        if(element.compareTo(current.element)==-1){
            if(current.left == null){
                current.left = new BSTNode<T>(element);
            } else{
                insertHelper(current.left, element);
            }
        } else{
            if(current.right == null){
                current.right = new BSTNode<T>(element);
            } else{
                insertHelper(current.right, element); 
            }
        }
    }

    @Override
    public void inOrder(){
        if(isEmpty()){
            throw new NullPointerException("Can't do in order traversal, BST is Empty!");
        }
        System.out.println("***BST IN ORDER TRAVERSAL***");
        inOrderHelper(this.root);
        System.out.println("***END***");
    }

    private void inOrderHelper(BSTNode<T>current){
        if(current==null){
            return;
        }

        inOrderHelper(current.left);
        System.out.println(current);
        inOrderHelper(current.right);
    }

    @Override
    public int size(){
        if(isEmpty()){
            throw new NullPointerException("Can't get Size, BST is Empty!");
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
        if(isEmpty()){
            throw new NullPointerException("Can't get Depth, BST is Empty!");
        }
        return depthHelper(this.root);
    }

    private int depthHelper(BSTNode<T> current){
        if(current==null){
            return 0;
        }

        int left = depthHelper(current.left);
        int right = depthHelper(current.right);
        if(left > right){
            return 1 + depthHelper(current.left);
        } else{
            return 1 + depthHelper(current.right);
        }
    }

    @Override
    public T min(){
        if(isEmpty()){
            throw new NullPointerException("Can't get Min, BST is empty!");
        }
        return minHelper(this.root);
    }

    private T minHelper(BSTNode<T> current){
        if(current==null){
            return null;
        } else{
            if(current.left==null){
                return current.element;
            } else{
                return minHelper(current.left);
            }
        }
    }

    @Override
    public T max(){
        if(isEmpty()){
            throw new NullPointerException("Can't get Max, BST is empty!");
        }
        return maxHelper(this.root);
    }

    public T maxHelper(BSTNode<T> current){
        if(current.right == null){
                return current.element;
        } else{
            return maxHelper(current.right);
        }
    }

    @Override
    public T remove(T element){
        return null;
    }

    @Override
    public boolean contains(T element){
        return false;
    }

    @Override
    public boolean isEmpty(){
        return this.root == null;
    }


}