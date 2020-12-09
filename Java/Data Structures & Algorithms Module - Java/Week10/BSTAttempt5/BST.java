/*
BST.java
Billy Cussen
09/12/2020
*/

public class BST<T extends Comparable<T>> implements BSTInterface<T>{

    BSTNode<T> root;

    public boolean isEmpty(){
        return this.root == null;
    }

    public int size(){
        if(isEmpty()){
            return 0;
        }
        return sizeHelper(this.root);
    }

    private int sizeHelper(BSTNode<T> current){
        if(current==null){
            return 0;
        }
        return 1 + sizeHelper(current.left)+sizeHelper(current.right);
    }

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
            if(current.right==null){
                current.right = new BSTNode<T>(element);
            } else{
                insertHelper(current.right, element);
            }
        }
    }

    public void inOrder(){
        if(isEmpty()){
            throw new NullPointerException("Can't do in order Traversal, BST is Empty!");
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

    public T max(){
        if(isEmpty()){
            throw new NullPointerException("Can't get Max, BST is Empty!");
        }
        return maxHelper(this.root);
    }

    private T maxHelper(BSTNode<T> current){
        if(current.right==null){
            return current.element;
        } else{
            return maxHelper(current.right);
        }
    }

    public T min(){
        if(isEmpty()){
            throw new NullPointerException("Can't get Min, BST is Empty!");
        }
        return minHelper(this.root);
    }

    private T minHelper(BSTNode<T> current){
        if(current.left == null){
            return current.element;
        } else{
            return minHelper(current.left);
        }
    }

    public int depth(){
        if(isEmpty()){
            return 0;
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

    public boolean contains(T element){
        if(isEmpty()){
            return false;
        }
        return containsHelper(this.root, element);
    }

    private boolean containsHelper(BSTNode<T> current, T element){
        if(current==null){
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

    public boolean remove(T element){
        BSTNode<T> current = findNode(element);
        BSTNode<T> parent = findParent(element);
        
        if(isEmpty()){
            throw new NullPointerException("Can't remove "+element+", BST is Empty!");
        } else if(element.compareTo(this.root.element)==0){
            throw new NullPointerException("Can't remove "+element+", this is the Root Node!");
        } else if(current.left == null && current.right == null){
            if(current.element.compareTo(parent.element) == -1){
                parent.left = null;
            } else{
                parent.right = null;
            }
            return true;
        } else if(current.left != null && current.right == null){
            if(current.element.compareTo(parent.element)==-1){
                parent.left = current.left;
            } else{
                parent.right = current.left;
            }
            return true;
        } else if (current.left == null && current.right != null){
            if(current.element.compareTo(parent.element)==-1){
                parent.left = current.right;
            } else{
                parent.right = current.right;
            }
            return true;
        } else if (current.left != null && current.right != null){
            T max=maxHelper(current.left);
            
            BSTNode<T> replacement=findNode(max);
            BSTNode<T> replacementParent=findParent(max);
            
            replacementParent.right=replacement.left;
            current.element=replacement.element;
            return true;
        }
        return false;
    }

    private BSTNode<T> findNode(T element){
        if(isEmpty()){
            throw new NullPointerException("Can't remove "+element+", BST is Empty!");
        } 
        return findNodeHelper(this.root, element);
    }

    private BSTNode<T> findNodeHelper(BSTNode<T> current, T element){
        if(element.compareTo(this.root.element)==0){
            throw new NullPointerException("Can't remove "+element+", this is the Root Node!");
        } 

        if(current==null){
            return null;
        } else if(element.compareTo(current.element)==0){
            return current;
        } else if(element.compareTo(current.element)==-1){
            return findNodeHelper(current.left, element);
        } else{
            return findNodeHelper(current.right, element);
        }
    }

    private BSTNode<T> findParent(T element){
        if(isEmpty()){
            throw new NullPointerException("Can't find Parent of "+element+", BST is Empty!");
        } else if(element.compareTo(this.root.element)==0){
            throw new NullPointerException("Can't find Parent of "+element+", its the Root Node!");
        }
        return findParentHelper(this.root, element);
    }

    private BSTNode<T> findParentHelper(BSTNode<T> current, T element){
        if(current == null){
            return null;
        }

        if(element.compareTo(current.element)==-1){
            if(element.compareTo(current.left.element)==0){
                return current;
            } else{
                return findNodeHelper(current.left, element);
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