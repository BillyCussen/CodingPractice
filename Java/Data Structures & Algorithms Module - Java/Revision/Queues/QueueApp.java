/*
QueueApp.java
Billy Cussen
11/01/2021
*/

public class QueueApp {
  
    public static void main(String [] args){

        Queues<Integer> myQueue = new Queues<Integer>();

        System.out.println("Is Empty: "+myQueue.isEmpty());
        System.out.println("Size: "+myQueue.size());
        System.out.println(myQueue.toString());

        try{
            System.out.println("Dequeue: "+myQueue.deQueue());
        } catch(NullPointerException e){
            System.out.println(e.getMessage());
        }

        myQueue.enQueue(1);
        myQueue.enQueue(2);
        myQueue.enQueue(4);
        myQueue.enQueue(6);
        myQueue.enQueue(8);
        myQueue.enQueue(10);

        System.out.println("Is Empty: "+myQueue.isEmpty());
        System.out.println("Size: "+myQueue.size());
        System.out.println(myQueue.toString());

        System.out.println("Dequeue: "+myQueue.deQueue());
        System.out.println("Dequeue: "+myQueue.deQueue());
        System.out.println("Dequeue: "+myQueue.deQueue());

        System.out.println(myQueue.toString());


    }
}
