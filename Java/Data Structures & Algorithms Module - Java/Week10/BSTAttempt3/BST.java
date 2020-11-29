/*
BST.java
Billy Cussen
28/11/2020
*/
public class BST<T extends Comparable<T>> implements BSTInterface<T>{

    Node<T> root;

    @Override
    public void insert(T element){
        if(isEmpty()){
            this.root = new Node<T>(element);
        }
        insertHelper(this.root, element);
    }

    private void insertHelper(Node<T> current, T element){
        if(element.compareTo(current.element)==-1){
            if(current.left==null){
                current.left = new Node<T>(element);
            } else{
                insertHelper(current.left,element);
            }
        } else{
            if(current.right==null){
                current.right = new Node<T>(element);
            } else{
                insertHelper(current.right,element);
            }
        }
    }

    @Override
    public void inOrder(){
        if(isEmpty()){
            throw new NullPointerException("Can't do in order traversal, BST is Empty!");
        } else{
            System.out.println("***BST IN ORDER TRAVERSAL***");
            inOrderHelper(this.root);
            System.out.println("***END***");
        }
    }

    private void inOrderHelper(Node<T> current){
        if(current==null){
            return;
        }

        inOrderHelper(current.left);
        System.out.println(current);
        inOrderHelper(current.right);
    }

    @Override
    public T remove(T element){
        if(isEmpty()){
            throw new NullPointerException("Can't Remove "+element+", the BST is Empty!");
        }
        return removeHelper(this.root, element);
    }

    private T removeHelper(Node<T> current, T element){
        return null;        
    }

    @Override
    public boolean isEmpty(){
        return this.root == null;
    }

    @Override
    public boolean contains(T element){
        if(isEmpty()){
            throw new NullPointerException("Can't check if BST contains "+element+", BST is Empty!");
        } 
        return containsHelper(this.root, element);
    }

    private boolean containsHelper(Node<T> current, T element){
        if(current == null){
            return false;
        }

        if(element.compareTo(current.element)==0){
            return true;
        } else{
            return containsHelper(current.left,element)||containsHelper(current.right,element);
        }
    }

    @Override
    public int size(){
        if(isEmpty()){
            throw new NullPointerException("Can't get Size, BST is Empty!");
        }
        return sizeHelper(this.root);
    }

    private int sizeHelper(Node<T> current){
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

    private int depthHelper(Node<T> current){
        if(current==null){
            return 0;
        }

        int leftSize = depthHelper(current.left);
        int rightSize = depthHelper(current.right);

        if(leftSize>rightSize){
            return 1+leftSize;
        } else{
            return 1+rightSize;
        }
    }

    @Override
    public T max(){
        if(isEmpty()){
            throw new NullPointerException("Can't get Max, BST is Empty!");
        } 
        return maxHelper(this.root);
    }

    private T maxHelper(Node<T> current){
        if(current==null){
            return null;
        }

        if(current.right==null){
            return current.element;
        } else{
            return maxHelper(current.right);
        }
    }

    @Override
    public T min(){
        if(isEmpty()){
            throw new NullPointerException("Can't get Min, BST is Empty!");
        }
        return minHelper(this.root);
    }

    private T minHelper(Node<T> current){
        if(current==null){
            return null;
        }

        if(current.left == null){
            return current.element;
        } else{
            return minHelper(current.left);
        }
    }

    @Override
    public Node<T> findNode(T element){
        if(isEmpty()){
            throw new NullPointerException("Can't find node containing "+element+", BST is Empty!");
        }
        return findNodeHelper(this.root, element);
    }

    private Node<T> findNodeHelper(Node<T> current, T element){
        if(current==null){
            return null;
        }

        if(element.compareTo(current.element)==-1){
            if(element.compareTo(current.left.element)==0){
                return current.left;
            } else{
                return findNodeHelper(current.left,element);
            }
        } else{
            if(element.compareTo(current.right.element)==0){
                return current.right;
            } else{
                return findNodeHelper(current.right,element);
            }
        }
    }

    @Override
    public Node<T> findParent(T element){
        if(isEmpty()){
            throw new NullPointerException("Can't find Parent of "+element+", BST is Empty!");
        } else if(this.root.element==element){
            throw new NullPointerException("Can't find Parent of"+element+", this is the Root Node!");
        }
        return findParentHelper(this.root,element);
    }

    private Node<T> findParentHelper(Node<T> current, T element){
        if(current==null){
            return null;
        }

        if(element.compareTo(current.element)==-1){
            if(element.compareTo(current.left.element)==0){
                return current;
            } else{
                return findParentHelper(current.left,element);
            }
        } else{
            if(element.compareTo(current.right.element)==0){
                return current;
            } else{
                return findParentHelper(current.right,element);
            }
        }
    }

}