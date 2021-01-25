/*
BST.java
Billy Cussen
25/01/2021
*/
public class BST<T extends Comparable<T>>{

    Node<T> root;

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
                insertHelper(current.right, element);
            }
        }
    }

    public boolean isEmpty(){
        return this.root == null;
    }

    public void inOrder(){
        if(isEmpty()){
            System.out.println("BST is Empty!");
        } else{
            System.out.println("***IN ORDER BST TRAVERSAL***");
            inOrderHelper(this.root);
            System.out.println("***END***");
        }
    }

    private void inOrderHelper(Node<T> current){
        if(current == null){
            return;
        }

        inOrderHelper(current.left);
        System.out.println(current.toString());
        inOrderHelper(current.right);
    }

    public T max(){
        if(isEmpty()){
            return null;
        }
        return maxHelper(this.root);
    }

    private T maxHelper(Node<T> current){
        if(current.right==null){
            return current.element;
        } else{
            return maxHelper(current.right);
        }
    }

    public T min(){
        if(isEmpty()){
            return null;
        }
        return minHelper(this.root);
    }

    private T minHelper(Node<T> current){
        if(current.left == null){
            return current.element;
        } else{
            return minHelper(current.left);
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

        int left = 1 + depthHelper(current.left);
        int right = 1 + depthHelper(current.right);
        if(left >= right){
            return left;
        } else{
            return right;
        }
    }

    public boolean contains(T element){
        if(isEmpty()){
            return false;
        }
        return containsHelper(this.root, element);
    }

    private boolean containsHelper(Node<T> current, T element){
        if(current==null){
            return false;
        }

        if(element.compareTo(current.element)==0){
            return true;
        } else if(element.compareTo(current.element)==-1){
            return containsHelper(current.left, element);
        } else{
            return containsHelper(current.right, element);
        }
    }

}