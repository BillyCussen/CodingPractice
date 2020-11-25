/*
BinarySearchTreeInterface.java
Billy Cussen
24/11/2020 - Updated on 25/11/2020
*/

public interface BinarySearchTreeInterface<T>{
    public void insert(T elem);
    public void inOrder();
    public int size();
    public int getDepth();
    public T getMin();
    public T getMax();
    public T remove(T elem);
    public boolean isEmpty();
    public boolean contains(T elem);
}