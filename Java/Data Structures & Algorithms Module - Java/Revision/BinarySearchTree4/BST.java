/*
BST.java
Billy Cussen
01/02/2021
*/

public class BST<T extends Comparable<T>> {
    
    Node<T> root;

    public BST(){
        this.root = null;
    }

    public boolean isEmpty(){
        return this.root == null;
    }

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

    public boolean contains(T element){
        if(isEmpty()){
            return false;
        }
        return containsHelper(element, this.root);
    }

    private boolean containsHelper(T element, Node<T> current){
        if(current==null){
            return false;
        }

        if(element.compareTo(current.element)==0){
            return true;
        } else if(element.compareTo(current.element) == -1){
            return containsHelper(element, current.left);
        } else{
            return containsHelper(element, current.right);
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

    public T max(){
        if(isEmpty()){
            return null;
        }
        return maxHelper(this.root);
    }

    private T maxHelper(Node<T> current){
        if(current.right == null){
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

    public Node<T> findNode(T element){
        if(isEmpty()){
            return null;
        } else{
            return findNodeHelper(element, this.root);
        }
    }

    private Node<T> findNodeHelper(T element, Node<T> current){
        if(current == null){
            return null;
        }

        if(element.compareTo(current.element)==0){
            return current;
        } else if(element.compareTo(current.element)==-1){
            return findNodeHelper(element, current.left);
        } else{
            return findNodeHelper(element, current.right);
        }
    }

    public Node<T> findParent(T element){
        if(isEmpty()||this.root.element==element){
            return null;
        }
        return findParentHelper(element, this.root);
    }

    private Node<T> findParentHelper(T element, Node<T> current){
        if(current == null){
            return null;
        }

        if(element.compareTo(current.element)==-1){
            if(element.compareTo(current.left.element)==0){
                return current;
            } else{
                return findParentHelper(element, current.left);
            }
        } else{
            if(element.compareTo(current.right.element)==0){
                return current;
            } else{
                return findParentHelper(element, current.right);
            }
        }
    }

    public int depth(){
        if(isEmpty()){
            return 0;
        }
        return depthHelper(this.root);
    }

    private int depthHelper(Node<T> current){
        if(current == null){
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

    public void inOrder(){
        if(isEmpty()){
            System.out.println("Can't traverse, its empty!");
        } else{
            System.out.println("***BST INORDER TRAVERSAL***");
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

    public boolean remove(T element){

        Node<T> toRemove = findNode(element);
        Node<T> parentNode = findParent(element);

        if(isEmpty() || contains(element)==false || this.root.element.compareTo(element)==0){
            return false;
        } else if(toRemove.left == null && toRemove.right == null){
            if(toRemove.element.compareTo(parentNode.element)==-1){
                toRemove.left = null;
            } else{
                toRemove.right = null;
            } 
            return true;
        } else if(toRemove.left != null && toRemove.right == null){
            if(toRemove.element.compareTo(parentNode.element)==-1){
                parentNode.left = toRemove.left;
            } else{
                parentNode.right = toRemove.left;
            }
            return true;
        } else if(toRemove.left == null && toRemove.right != null){
            if(toRemove.element.compareTo(parentNode.element)==-1){
                parentNode.left = toRemove.right;
            } else{
                parentNode.right = toRemove.right;
            }
            return true;
        } else if(toRemove.left != null && toRemove.right != null){
            T max = maxHelper(toRemove.left);
            Node<T> replacement = findNode(max);
            Node<T> replacementParent = findParent(max);
            replacementParent.right = replacement.left;
            toRemove.element = replacement.element;
            return true;
        } 
        return true;
    }

}
