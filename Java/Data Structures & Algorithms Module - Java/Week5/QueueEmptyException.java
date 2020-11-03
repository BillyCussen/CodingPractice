/*
QueueEmptyException.java
Billy Cussen
29/09/2020
*/
public class QueueEmptyException extends Exception{
    public QueueEmptyException(){
        super("The User Tried to Look up or Remove from an Empty Queue!");
    }
}