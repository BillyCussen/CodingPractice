/*
StackInterface.java
Billy Cussen
16/09/2020
*/

public interface StackInterface<T>{

    void push(T element);
    T pop();
    T peek();
    int size();
    boolean isEmpty();
}