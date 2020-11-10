/*
LinkedListInterface.java
Billy Cussen
10/11/2020
*/

public interface LinkedListInterface<T>{

    public void add(T element);
    public void addByIndex(T element, int index);
    public void addBefore(T element, T target);
    public void addAfter(T element, T target);
    public T removeByElement(T element);
    public T removeByIndex(int index);
    public boolean isEmpty();
    public int size();
}