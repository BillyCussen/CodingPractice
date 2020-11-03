/*
DoublyLinkedListInterface.java
Billy Cussen
11/09/2020
*/

public interface DoublyLinkedListInterface<T>{

    boolean isEmpty();
    int size();
    void addByElement(T element);
    void addByIndex(T element, int index);
    void addFirst(T element);
    void addAtEnd(T element);
    void addBefore(T element, T target);
    T getByIndex(int index);
    T removeByElement(T element);
    T removeByIndex(int index);
    String toStringForward();
    String toStringBackward();
}