/*
QueueInterface.java
Billy Cussen
29/09/2020
*/

public interface QueueInterface<T>{

    void enQueue(T element);
    T deQueue() throws QueueEmptyException;
    T peek() throws QueueEmptyException;
    boolean isEmpty();
    int size();
}