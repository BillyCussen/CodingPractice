/*
BinarySearchTreeInterface.java
Billy Cussen
24/11/2020
*/

public interface BinarySearchTreeInterface<T>{

    public void insert(T element);
    public void inOrder();
    public T getMin();
    public T getMax();
    public T remove(T element);
    public boolean isEmpty();
    public boolean contains(T element);
    public int size();
    public int depth();
}