/*
LinkedListPractice.java
Billy Cussen
27/09/2020
*/

//Practiced Sigle LinkedList Creation as well as Node Object and LL Interface

public class LinkedListPractice{

    public static void main(String [] args){

        LLInterface<Integer> test = new LinkedList<Integer>();
        test.add(2);
        test.add(4);
        test.add(6);
        test.addByIndex(100,0);
        test.addByIndex(100,2);
        test.addByIndex(100,5);
        test.addByIndex(555,test.size());
        test.addAtStart(1000);
        test.addAtEnd(2000);
        test.addBefore(1000,9999);
        test.addBefore(2000,9999);
        test.addAfter(9999,999999);
        test.addAfter(2000,999999);
        test.remove(999999);
        test.remove(999999);
        test.removeByIndex(0);
        test.removeByIndex(test.size()-1);

        System.out.println(test.toString());
    }
}

interface LLInterface<T>{
    void add(T element);
    void addByIndex(T element, int index);
    void addAtStart(T element);
    void addAtEnd(T element);
    void addBefore(T element, T target);
    void addAfter(T element, T target);
    T remove(T element);
    T removeByIndex(int index);
    int size();
    boolean isEmpty();
}

class Node<T>{

    T element;
    Node<T> next;

    Node(T element){
        this.element = element;
    }

    Node(T element, Node<T> next){
        this.element = element;
        this.next = next;
    }

}

class LinkedList<T> implements LLInterface<T>{
    
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
            throw new IndexOutOfBoundsException();
        } else if(index == 0){
            addAtStart(element);
        } else{
            Node<T> current = first;
            for(int i = 0; i < index - 1; i++){
                current = current.next;
            }
            current.next = new Node<T>(element, current.next);
        }
    }

    @Override
    public void addAtStart(T element){
        if(isEmpty()){
            add(element);
        } else{
            first = new Node<T>(element, first);
        }
    }
    
    @Override
    public void addAtEnd(T element){
        add(element);
    }

    @Override
    public void addBefore(T element, T target){
        addByIndex(target, getIndex(element));
    }
    
    @Override
    public void addAfter(T element, T target){
        addByIndex(target, getIndex(element)+1);
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
    public T remove(T element){
        return removeByIndex(getIndex(element));
    }

    @Override
    public T removeByIndex(int index){
        if(isEmpty()||index<0||index>size()){
            throw new IndexOutOfBoundsException();
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
    public String toString(){
        String result = "***Linked List Traversal***\n";
        int position = 0;
        Node<T> current = first;
        return toStringHelper(result,position, current);
    }

    private String toStringHelper(String result, int position, Node<T> current){
        if(current == null){
            return result;
        }
        result+="Positon "+position+", Element: "+current.element+"\n";
        return toStringHelper(result,++position,current.next);
    }
}