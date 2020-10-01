/*
StackInterface.java
Billy Cussen
01/10/2020
*/

//Based on Mid Term Assessment - Provide a Linked, Array and ArrayList implementation of a Stack

public interface StackInterface<T>{
    void push(T e);
    T pop();
    T peek();
    int size();
}