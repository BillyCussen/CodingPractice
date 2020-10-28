/*
QueuePractice.java
Billy Cussen
26/10/2020
*/

public class QueuePractice<T> implements QueuePracticeInterface<T>{

    NodeQueuePractice<T> first;
    NodeQueuePractice<T> last;

    public static void main(String [] args){

        QueuePracticeInterface<Integer> myQueue = new QueuePractice<Integer>();
        
        try{
            System.out.println("To String: "+myQueue.toString());
            //System.out.println("Size: "+myQueue.size());
            System.out.println("Peek: "+myQueue.peek());
            System.out.println("Empty: "+myQueue.isEmpty());
        }catch(NullPointerException e){
            System.out.println(e.getMessage());
        }


        myQueue.enQueue(2);
        myQueue.enQueue(4);
        myQueue.enQueue(6);
        myQueue.deQueue();
        System.out.println("\n"+myQueue.toString());
        System.out.println("Size: "+myQueue.size());
        System.out.println("Peek: "+myQueue.peek());
        System.out.println("Empty: "+myQueue.isEmpty());
    }

    @Override
    public void enQueue(T element){
        NodeQueuePractice<T> oldLast = last;
        last = new NodeQueuePractice<T>(element, null);
        if(isEmpty()){
            first = last;
        } else{
            oldLast.next = last;
        }
    }
    
    @Override
    public T deQueue(){
        if(isEmpty()){
            throw new NullPointerException("Can't remove anything, the Queue is Empty!");
        } else{
            T element = first.element;
            first = first.next;
            if(first==null){
                last = null;
            }
            return element;
        }
    }
    
    @Override
    public T peek(){
        if(isEmpty()){
            throw new NullPointerException("Can't Peek anything, the Queue is Empty!");
        } else{
            return first.element;
        }
    }
    
    @Override
    public int size(){
        if(isEmpty()){
            throw new NullPointerException("The Queue is Empty, can't determine size!");
        } else{
            return sizeHelper(first);
        }
    }

    private int sizeHelper(NodeQueuePractice<T> current){
        if(current==null){
            return 0;
        } 
        return 1 + sizeHelper(current.next);
    }
    
    @Override
    public boolean isEmpty(){
        return first == null;
    }   

    @Override
    public String toString(){
        if(isEmpty()){
            return "The Queue is empty!";
        } else{
            String result = "***Queue Traversal***\n";
            int position = 0;
            return toStringHelper(first, result, position);
        }
    }

    private String toStringHelper(NodeQueuePractice<T> current, String result, int position){
        if(current == null){
            return result;
        }
        result+= "Position "+position+", Element: "+current.element+"\n";
        return toStringHelper(current.next, result, ++position);
    }

}

interface QueuePracticeInterface<T>{
    void enQueue(T element);
    T deQueue();
    T peek();
    int size();
    boolean isEmpty();
}

class NodeQueuePractice<T>{

    T element;
    NodeQueuePractice<T> next;

    public NodeQueuePractice(T element, NodeQueuePractice<T> next){
        this.element = element;
        this.next = next;
    }
}