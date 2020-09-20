/*
LinkedListInterface.java
Billy Cussen
09/09/2020
*/
public interface LinkedListInterface<T>{

    int size();
    boolean isEmpty();
    void addByElement(T element);
    void addByIndex(T element, int index);
    T removeByIndex(int index);
    //Tutorial Exercises - 10/09/2020
    void addBefore(T element, T target);
    void addAfter(T element, T target);
    T removeByElement(T target);
}