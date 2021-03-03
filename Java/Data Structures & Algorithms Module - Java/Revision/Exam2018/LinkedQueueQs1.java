/*
LinkedQueueQs1.java
Billy Cussen
03/03/2021
*/

/*
QS 1:
Write a Node/ Link based Java class, called LinkedQueue<T>, which implements the Queue<T>
interface, which contains the following methods (comment the methods to denote the purpose).
 enqueue
 dequeue
 size
 frontElement
 isEmpty
*/

public class LinkedQueueQs1<T> implements Queue<T>{

    Node<T> first;
    Node<T> last;

    public void enqueue(T element){
        Node<T> oldLast = this.last;
        this.last = new Node<T>(element, null);
        if(isEmpty()){
            this.first = this.last;
        } else{
            oldLast.next = last;
        }
    }

    public boolean deQueue(){
        if(isEmpty()){
            return false;
        } 
        this.first = this.first.next;
        if(isEmpty()){
            this.last = null;
        }
        return true;
    }

    public int size(){
        if(isEmpty()){
            return 0;
        }
        return sizeHelper(this.first);
    }

    private int sizeHelper(Node<T> current){
        if(current == null){
            return 0;
        }
        return 1 + sizeHelper(current.next);
    }

    public T frontElement(){
        if(isEmpty()){
            return null;
        }
        return this.first.element;
    }

    public boolean isEmpty(){
        return this.first == null;
    }

    public static void main(String[]args){

        LinkedQueueQs1<String> myQueue = new LinkedQueueQs1<String>();
        
        System.out.println("Is Empty: "+myQueue.isEmpty());
        System.out.println("Size: "+myQueue.size());
        System.out.println("Front Element: "+myQueue.frontElement());
        System.out.println("Dequeue: "+myQueue.deQueue());
        System.out.println(myQueue.toString());

        myQueue.enqueue("Hello");
        myQueue.enqueue("Hi");
        myQueue.enqueue("Tag");
        myQueue.enqueue("Dia Dhuit");

        System.out.println("Is Empty: "+myQueue.isEmpty());
        System.out.println("Size: "+myQueue.size());
        System.out.println("Front Element: "+myQueue.frontElement());
        System.out.println("Dequeue: "+myQueue.deQueue());
        System.out.println(myQueue.toString());
    }

    @Override
    public String toString(){
        if(isEmpty()){
            return "Can't do Traversal, Queue is Empty!\n";
        }
        String result = "***Linked Queue Traversal***\n";
        return toStringHelper(this.first, result, 1);
    }

    private String toStringHelper(Node<T> current, String result, int position){
        if(current == null){
            result+="***END***";
            return result;
        }
        result+="Position "+position+", Element: "+current.element+"\n";
        return toStringHelper(current.next, result, ++position);
    }

}

interface Queue<T>{
    
    void enqueue(T element);
    boolean deQueue();
    int size();
    T frontElement();
    boolean isEmpty();
}

class Node<T>{

    T element;
    Node<T> next;

    public Node(T element, Node<T> next){
        this.element = element;
        this.next = next;
    }
}