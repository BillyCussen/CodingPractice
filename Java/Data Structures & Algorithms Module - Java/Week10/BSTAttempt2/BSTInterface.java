/*
BSTInterface.java
Billy Cussen
26/11/2020
*/
public interface BSTInterface<T>{
    public void insert(T element);
    public void inOrder();
    public int size();
    public int depth();
    public T getMin();
    public T getMax();
    public boolean isEmpty();
    public boolean contains(T element);
    public T remove(T element);
    public BSTNode<T> findNode(T element);
    public BSTNode<T> findParent(T element);
}