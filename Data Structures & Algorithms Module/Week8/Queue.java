/*
Queue.java
Billy Cussen
26/10/2020
*/

public class Queue<T> implements QueueInterface<T>{

    Node<T> first;
    Node<T> last;

    public static void main(String[] args){

        QueueInterface<Integer> myQueue = new Queue<Integer>();
        myQueue.enqueue(20);
        myQueue.enqueue(40);
        myQueue.enqueue(60);
        myQueue.deQueue();
        System.out.println(myQueue.toString());
        System.out.println(myQueue.peek());
    }

    @Override
    public void enqueue(T element){
        Node<T> oldLast = last;
        last = new Node<T>(element, null);
        if(isEmpty()){
            first = last;
        } else{
            oldLast.next = last;
        }
    }
    
    @Override
    public T deQueue(){
        if(isEmpty()){
            throw new NullPointerException();
        } else{
            T element = first.element;
            first = first.next;
            if(isEmpty()){
                last = null;
            }
            return element;
        }
    }

    @Override
    public int size(){
        return sizeHelper(first);
    }

    private int sizeHelper(Node<T> current){
        if(current == null){
            return 0;
        }
        return 1 + sizeHelper(current.next);
    }
    
    @Override
    public boolean isEmpty(){
        return first == null;
    }
    
    @Override
    public T peek(){
        if(isEmpty()){
            throw new NullPointerException();
        } else{
            return first.element;
        }
    } 

    @Override
    public String toString(){
        if(isEmpty()){
            return "The Queue is empty";
        }
        String result = "***QUEUE TRAVERSAL***\n";
        int position = 0;
        return toStringHelper(result,position,first);
    }

    private String toStringHelper(String result, int position, Node<T> current){
        if(current==null){
            result+="***END***";
            return result;
        }
        result+="Position "+position+", Element: "+current.element+"\n";
        return toStringHelper(result,++position, current.next);
    }

}

interface QueueInterface<T>{
    void enqueue(T element);
    T deQueue();
    int size();
    boolean isEmpty();
    T peek();
}

class Node<T>{

    T element;
    Node<T> next;

    public Node(T element){
        this.element = element;
    }

    public Node(T element, Node<T> next){
        this.element = element;
        this.next = next;
    }
}