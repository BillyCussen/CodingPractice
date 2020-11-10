/*
LinkedList.java
Billy Cussen
10/11/2020
*/
public class LinkedList<T> implements LinkedListInterface<T>{

    Node<T> first;

    @Override
    public void add(T element){
        if(isEmpty()){
            first = new Node<T>(element);
        } else{
            Node<T> current = first;
            while(current.next != null){
                current = current.next;
            }
            current.next = new Node<T>(element, null);
        }
    }

    @Override
    public void addByIndex(T element, int index){
        if(isEmpty()){
            add(element);
        } else if(index < 0 || index > size()){
            throw new NullPointerException();
        } else if(index == 0){
            first = new Node<T>(element, first);
        } else{
            Node<T> current = first;
            for(int i = 0; i < index - 1; i++){
                current = current.next;
            }
            current.next = new Node<T>(element,current.next);
        }
    }
    
    @Override
    public void addBefore(T element, T target){
        int index = getIndex(target);
        addByIndex(element,index);
    }
    
    @Override
    public void addAfter(T element, T target){
        int index = getIndex(target);
        addByIndex(element,index+1);
    }
    
    @Override
    public T removeByElement(T element){
        int index = getIndex(element);
        return removeByIndex(index);
    }
    
    @Override
    public T removeByIndex(int index){
        if(index < 0 || index > size() || isEmpty()){
            throw new NullPointerException();
        } else if(index == 0){
            T element = first.element;
            first = first.next;
            return element;
        } else{
            Node<T> current = first;
            for(int i = 0; i < index-1; i++){
                current = current.next;
            }
            T element = current.next.element;
            current.next = current.next.next;
            return element;
        }
    }

    private int getIndex(T target){
        Node<T> current = first;
        int index = 0;
        while(current != null){
            if(current.element.equals(target)){
                return index;
            }
            index++;
            current = current.next;
        }
        return -1;
    }   
    
    @Override
    public boolean isEmpty(){
        return first == null;
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
    public String toString(){
        if(first==null){
            return "The List is empty!";
        }
        
        String result = "***LINKEDLIST TRAVERSAL***\n";
        int position = 0;
        return toStringHelper(first,result,position);
    }

    private String toStringHelper(Node<T> current, String result, int position){
        if(current == null){
            result+="***END***";
            return result;
        }
        result+="Position "+position+", Element: "+current.element+"\n";
        return toStringHelper(current.next,result,++position);
    }

}