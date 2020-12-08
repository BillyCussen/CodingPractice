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
        BSTNode<T> toRemove = findNode(element);
        BSTNode<T> parent = findParent(element);
        if(isEmpty()){
            throw new NullPointerException("Can't remove "+element+" from BST, BST is Empty!");
        } else if (toRemove==null){
            throw new NullPointerException(element+" does not exist on the BST!");
        } else if (element.compareTo(this.root.element)==0){
            throw new NullPointerException("Can't remove "+element+", its the element of the Root Node!");
        }
        
        if(toRemove.left==null && toRemove.right == null){
            if(toRemove.element.compareTo(parent.element)==-1){
                parent.left = null;
                return toRemove.element;
            } else{
                parent.right = null;
                return toRemove.element;
            }
        } else if(toRemove.left!=null && toRemove.right == null){
            if(toRemove.element.compareTo(parent.element)==-1){
                parent.left = toRemove.left;
            } else{
                parent.left = toRemove.right;
            }
        } else if(toRemove.left == null && toRemove.right != null){
            if(toRemove.element.compareTo(parent.element)==-1){
                parent.left = toRemove.right;
            } else{
                parent.right = toRemove.right;
            }
        }

        return null;
    }

    private BSTNode<T> findNode(T element){
        if(isEmpty()){
            throw new NullPointerException("Can't find Node with element "+element+", BST is Empty!");
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
            return findNodeHelper(current.left, element);
        } else{
            return findNodeHelper(current.right, element);
        }
    }

    private BSTNode<T> findParent(T element){
        if(isEmpty()){
            throw new NullPointerException("Can't find Parent Node of element "+element+", BST is Empty!");
        } else if(element.compareTo(this.root.element)==0){
            throw new NullPointerException("Can't find Parent Node of element "+element+", this is the Root Node!");
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

    @Override
    public boolean contains(T element){
        if(isEmpty()){
            throw new NullPointerException("Can't check if BST contains "+element+", BST is empty!");
        }
        return containsHelper(this.root, element);
    }

    private boolean containsHelper(BSTNode<T> current, T element){
        if(current == null){
            return false;
        }

        if(element.compareTo(current.element)==0){
            return true;
        } else if (element.compareTo(current.element)==-1){
            return containsHelper(current.left, element);
        } else{
            return containsHelper(current.right, element);
        }
    }

    @Override
    public boolean isEmpty(){
        return this.root == null;
    }
}