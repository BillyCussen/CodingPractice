/*
Queues.java
Billy Cussen
11/01/2021
*/

public class Queues<T>{

    Node<T> first;
    Node<T> last;

    public Queues(){
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
        return sizeHelper(this.first);
    }

    private int sizeHelper(Node<T> current){
        if(current == null){
            return 0;
        }
        return 1 + sizeHelper(current.next);
    }

    public String toString(){
        if(isEmpty()){
            return "Can't print Queue as it is Empty!";
        } else{
            String result = "***QUEUE TRAVERSAL***\n";
            int position = size()-1;
            return toStringHelper(this.first, result, position);
        }
    }

    private String toStringHelper(Node<T> current, String result, int position){
        if(current == null){
            result+="***END***\n";
            return result;
        }
        result+="Position: "+position+", Element: "+current.element+"\n";
        return toStringHelper(current.next, result, --position);
    }

    public void enQueue(T element){
        Node<T> oldLast = this.last;
        this.last = new Node<T>(element, null);
        if(isEmpty()){
            this.first = this.last;
        } else{
            oldLast.next = this.last;
        }
    }

    public T deQueue(){
        if(isEmpty()){
            throw new NullPointerException("Can't Dequeue, Queue is Empty!");
        } else{
            T element = this.first.element;
            this.first = this.first.next;
            return element;
        }
    }

}