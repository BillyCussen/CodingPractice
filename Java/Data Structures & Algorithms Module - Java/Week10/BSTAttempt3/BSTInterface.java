/*
BSTInterface.java
Billy Cussen
28/11/2020
*/
public interface BSTInterface<T>{

    public void insert(T element);
    public void inOrder();
    public T remove(T element);
    public boolean isEmpty();
    public boolean contains(T element);
    public int size();
    public int depth();
    public T max();
    public T min();
    public Node<T> findNode(T element);
    public Node<T> findParent(T element);
}