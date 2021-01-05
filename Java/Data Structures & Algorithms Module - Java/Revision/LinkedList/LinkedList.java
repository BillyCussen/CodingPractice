/*
LinkedList.java
Billy Cussen
05/01/2020
*/
public class LinkedList<T> {
    
    Node<T> first;

    public LinkedList(){
        this.first = null;
    }

    public void add(T element){
        if(isEmpty()){
            this.first = new Node<T>(element, null);
        } else{
            Node<T> current = this.first;
            while(current.next!=null){
                current = current.next;
            }
            current.next = new Node<T>(element, null);
        }
    }

    public void addByIndex(T element, int index){
        if(isEmpty() || index < 0 || index > size()){
            throw new NullPointerException("List is Empty!");
        } else if(index == 0){
            this.first = new Node<T>(element, this.first);
        } else{
            Node<T> current = first;
            for(int i = 0; i < index-1;i++){
                current = current.next;
            }
            current.next = new Node<T>(element, current.next);
        }
    }

    public T removeByIndex(int index){
        if(isEmpty() || index < 0 || index > size()){
            throw new NullPointerException("LinkedList is Empty!");
        } else if(index == 0){
            T element = first.element;
            first = first.next;
            return element;
        } else{
            Node<T> current = first;
            for(int i = 0; i < index - 1; i++){
                current = current.next;
            }
            T element = current.next.element;
            current.next = current.next.next;
            return element;
        }
    }

    public boolean isEmpty(){
        return this.first == null;
    }

    public int size(){
        if(isEmpty()){
            throw new NullPointerException("LinkedList is Empty!");
        }
        return sizeHelper(this.first);
    }

    private int sizeHelper(Node<T> current){
        if(current == null){
            return 0;
        }
        return 1 + sizeHelper(current.next);
    }

    @Override
    public String toString(){
        if(isEmpty()){
            throw new NullPointerException("List is Empty!");
        }
        String result = "***LINKEDLIST TRAVERSAL***\n";
        int position = 1;
        return toStringHelper(this.first, result, position);
    }

    private String toStringHelper(Node<T> current, String result, int position){
        if(current == null){
            result+="***END***\n";
            return result;
        }
        result+="Position "+position+", Element: "+current.element+"\n";
        return toStringHelper(current.next, result, ++position);
    }

}
