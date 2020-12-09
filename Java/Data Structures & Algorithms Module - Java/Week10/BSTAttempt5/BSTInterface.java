/*
BSTInterface.java
Billy Cussen
09/12/2020
*/
public interface BSTInterface<T>{

    public void insert(T element);
    public void inOrder();
    public int size();
    public int depth();
    public T max();
    public T min();
    public boolean isEmpty();
    public boolean contains(T element);
    public boolean remove(T element);

}