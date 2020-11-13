/*
QueueInterface.java
Billy Cussen
13/11/2020
*/

public interface QueueInterface<T>{

    void enQueue(T element);
    T deQueue();
    T peek();
    boolean isEmpty();
    int size();

}