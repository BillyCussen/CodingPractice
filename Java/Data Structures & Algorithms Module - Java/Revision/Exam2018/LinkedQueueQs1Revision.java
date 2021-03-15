/*
LinkedQueueQs1Revision.java
Billy Cussen
15/03/2021
*/

public class LinkedQueueQs1Revision<T>{

    Node1<T> first;
    Node1<T> last;

    public LinkedQueueQs1Revision(){
        this.first = null;
        this.last = null;
    }

    public boolean isEmpty(){
        return this.first == null;
    }

    public int size(){
        if(isEmpty()){
            return 0;
        }
        return getSize(this.first);
    }

    private int getSize(Node1<T> current){
        if(current == null){
            return 0;
        }
        return 1 + getSize(current.next);
    }

    public void enQueue(T element){
        Node1<T> oldLast = this.last;
        last = new Node1<T>(element, null);
        if(isEmpty()){
            this.first = last;
        } else{
            oldLast.next = last;
        }
    }

    public boolean deQueue(){
        if(isEmpty()){
            return false;
        } else{
           this.first = this.first.next;
           if(isEmpty()){
               this.last = null;
           } 
           return true;
        }

    }

    public String toString(){
        if(isEmpty()){
            return "Can't do Queue Traversal, it is Empty!";
        } 
        String result = "***QUEUE TRAVERSAL***\n";
        int position = 1;
        return toStringHelper(this.first, result, position);
    }

    private String toStringHelper(Node1<T> current, String result, int position){
        if(current == null){
            result += "***END***\n";
            return result;
        }
        result+="Position "+position+", Element: "+current.element+"\n";
        return toStringHelper(current.next, result, ++position);
    }

    public T peek(){
        if(isEmpty()){
            return null;
        } else{
            return this.first.element;
        }
    }

    public static void main(String [] args){

        LinkedQueueQs1Revision<Integer> myQueue = new LinkedQueueQs1Revision<Integer>();

        System.out.println("Is Empty: "+myQueue.isEmpty());
        System.out.println("Size: "+myQueue.size());
        System.out.println(myQueue.toString());

        myQueue.enQueue(20);
        myQueue.enQueue(40);
        myQueue.enQueue(60);
        myQueue.enQueue(80);
        myQueue.enQueue(100);
        myQueue.enQueue(120);

        
        System.out.println("Is Empty: "+myQueue.isEmpty());
        System.out.println("Size: "+myQueue.size());
        System.out.println(myQueue.toString());
        
        System.out.println("Dequeue "+myQueue.peek()+": "+myQueue.deQueue());
        int queueSize = myQueue.size();
        System.out.println("Is Empty: "+myQueue.isEmpty());
        System.out.println("Size: "+queueSize);
        System.out.println(myQueue.toString());

        for(int i = 0; i < queueSize+1; i++){
            System.out.println("Dequeue "+myQueue.peek()+": "+myQueue.deQueue());
        }
        System.out.println("Is Empty: "+myQueue.isEmpty());
        System.out.println("Size: "+myQueue.size());
        System.out.println(myQueue.toString());
    }

}

class Node1<T>{

    T element;
    Node1<T> next;

    Node1(T element, Node1<T> next){
        this.element = element;
        this.next = next;
    }

}