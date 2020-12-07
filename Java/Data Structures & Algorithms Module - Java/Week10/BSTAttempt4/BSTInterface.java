/*
BSTInterface.java
Billy Cussen
07/12/2020
*/
public interface BSTInterface<T>{

    public void insert(T element);
    public void inOrder();
    public int size();
    public int depth();
    public T min();
    public T max();
    public T remove(T element);
    public boolean contains(T element);
    public boolean isEmpty();
}