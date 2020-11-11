/*
DLLinkedInterface.java
Billy Cussen
11/11/2020
*/
public interface DLLinkedInterface<T>{

    void add(T element);
    void addByIndex(T element, int index);
    void addBefore(T element, T target);
    void addAfter(T element, T target);
    T removeByElement(T element);
    T removeByIndex(int index);
    boolean isEmpty();
    int size();
    String toStringBackwards();
}