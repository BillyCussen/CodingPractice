/*
Queue.java
Billy Cussen
29/09/2020
*/

public class Queue<T> implements QueueInterface<T>{

    Node<T> first;
    Node<T> last;

    public Queue(){
        this.first = null;
        this.last = null;
    }

    @Override
    public void enQueue(T element){
        Node<T> oldLast = last;
        last = new Node<T>(element, null);
        if(isEmpty()){
            first = last;
        } else{
            oldLast.next = last;
        }
    }

    @Override
    public T deQueue() throws QueueEmptyException{
        if(isEmpty()){
            throw new QueueEmptyException();
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
    public T peek() throws QueueEmptyException{
        if(isEmpty()){
            throw new QueueEmptyException();
        } else{
            return first.element;
        }
    }

    @Override
    public boolean isEmpty(){
        return this.first == null;
    }

    @Override
    public int size(){
        return sizeHelper(first);
    }

    private int sizeHelper(Node<T> first){
        if(first == null){
            return 0;
        }
        return 1 + sizeHelper(first.next);
    }

    @Override
    public String toString(){
        int position = 0;
        String result = "***LINKED QUEUE TRAVERSAL***\n";
        Node<T> current = first;
        return toStringHelper(position, result, current);
    }

    private String toStringHelper(int position, String result, Node<T> current){
        if(current == null){
            return result;
        }
        result+="Position "+position+", Element: "+current.element+"\n";
        return toStringHelper(++position, result, current.next);
    }
}