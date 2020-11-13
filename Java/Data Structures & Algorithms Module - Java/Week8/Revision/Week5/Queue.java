/*
Queue.java
Billy Cussen
13/11/2020
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
        Node<T> oldLast = this.last;
        this.last = new Node<T>(element, null);
        if(isEmpty()){
            this.first = this.last;
        } else{
            oldLast.next = this.last;
        }
    }

    
    @Override
    public T deQueue(){
        if(isEmpty()){
            throw new NullPointerException("Can't Dequeue, the Queue is empty!");
        } else{
            T element = first.element;
            first = first.next;
            return element;
        }
    }
    
    @Override
    public T peek(){
        if(isEmpty()){
            throw new NullPointerException("Can't peek, the Queue is Empty!");
        } else{
            return this.first.element;
        }
    }
    
    @Override
    public boolean isEmpty(){
        return this.first == null;
    }

    @Override
    public int size(){
        return sizeHelper(this.first);
    }

    private int sizeHelper(Node<T> current){
        if(current==null){
            return 0;
        }
        return 1 + sizeHelper(current.next);
    }


    @Override
    public String toString(){
        if(isEmpty()){
            throw new NullPointerException("Can't traverse, the Queue is Empty!");
        }
        String result = "***QUEUE TRAVERSAL***\n";
        int position = 0;
        return toStringHelper(this.first, position, result);
    }

    private String toStringHelper(Node<T> current, int position, String result){
        if(current == null){
            result+="***END***\n";
            return result;
        }
        result+="Position "+position+", Element: "+current.element+"\n";
        return toStringHelper(current.next,++position,result);
    }

}