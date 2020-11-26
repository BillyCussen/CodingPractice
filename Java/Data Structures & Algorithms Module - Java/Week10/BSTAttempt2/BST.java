/*
BST.java
Billy Cussen
26/11/2020
*/
public class BST<T extends Comparable<T>> implements BSTInterface<T>{

    BSTNode<T> root;

    @Override
    public void insert(T element){
        if(isEmpty()){
            this.root = new BSTNode<T>(element);
        }
        insertHelper(element, this.root);
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
                current.right = new BSTNode<T>(element);
            } else{
                insertHelper(element,current.right);
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

    private void inOrderHelper(BSTNode<T> current){
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
            throw new NullPointerException("Can't get Size, BST is empty!");
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
            throw new NullPointerException("Can't get Depth, BST is empty!");
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
    public T getMin(){
        if(isEmpty()){
            throw new NullPointerException("Can't get Min, BST is Empty!");
        }
        return minHelper(this.root);
    }

    private T minHelper(BSTNode<T> current){
        if(current.left==null){
            return current.element;
        }
        return minHelper(current.left);
    }

    @Override
    public T getMax(){
        if(isEmpty()){
            throw new NullPointerException("Can't get Max, BST is Empty!");
        }
        return maxHelper(this.root);       
    }

    private T maxHelper(BSTNode<T> current){
        if(current.right==null){
            return current.element;
        }
        return maxHelper(current.right);
    }

    @Override
    public boolean isEmpty(){
        return this.root == null;
    }

    @Override
    public boolean contains(T element){
        if(isEmpty()){
            throw new NullPointerException("Can't get Element, BST Is Empty!");
        }
        return containsHelper(this.root, element);
    }

    private boolean containsHelper(BSTNode<T> current, T element){
        if(current==null){
            return false;
        }

        if(element.compareTo(current.element)==0){
            return true;
        } else if(element.compareTo(current.element)==1){
            return containsHelper(current.right,element);
        } else{
            return containsHelper(current.left,element);
        }
    }

    @Override
    public T remove(T element){
        return null;
    }

    @Override
    public BSTNode<T> findNode(T element){
        if(isEmpty()){
            throw new NullPointerException("Can't find Node, BST is Empty!");
        }
        return findNodeHelper(this.root, element);
    }

    private BSTNode<T> findNodeHelper(BSTNode<T> current, T element){
        if(current==null){
            return null;
        }

        if(element.compareTo(current.element)==0){
            return current;
        } else if(element.compareTo(current.element)==-1){
            return findNodeHelper(current.left,element);
        } else{
            return findNodeHelper(current.right,element);
        }
    }

    public BSTNode<T> findParent(T element){
        if(isEmpty()){
            throw new NullPointerException("Unable to find Parent, BST is Empty!");
        } else if(element.compareTo(this.root.element)==0){
            throw new NullPointerException("Can't get parent, Node selected is the Root!");
        }
        return findParentHelper(this.root, element);
    }

    private BSTNode<T> findParentHelper(BSTNode<T> current, T element){
        if(current==null){
            return null;
        }

        if(element.compareTo(current.element)==-1){
            if(element.compareTo(current.left.element)==0){
                return current;
            } else{
                return findParentHelper(current.left, element);
            }
        } else{
            if(element.compareTo(current.right.element)==0){
                return current;
            } else{
                return findParentHelper(current.right, element);
            }
        }
    }
}