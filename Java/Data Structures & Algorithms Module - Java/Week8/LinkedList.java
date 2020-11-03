/*
LinkedList.java
Billy Cussen
19/10/2020
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
            current.next = new Node<T>(element);
        }
    }

    @Override
    public void add(T element, int index){
        if(isEmpty()){
            add(element);
        } else if(index==0){
            first = new Node<>(element,first);
        } else{
            Node<T> current = first;
            for(int i = 0; i < index - 1;i++){
                current = current.next;
            }
            current.next = new Node<T>(element,current.next);
        }
    }
    
    @Override
    public void addBefore(T element, T target){
        int index = getIndex(target);
        if(isEmpty()){
            add(element);
        } else if(index < 0 || index > size()){
            throw new NullPointerException();
        } else if(index == 0){
            add(element,index);
        } else{
            Node<T> current = first;
            for(int i = 0; i < index - 1; i++){
                current = current.next;
            }
            current.next = new Node<T>(element, current.next);
        }
    }
    
    @Override
    public void addAfter(T element, T target){
        int index = getIndex(target);
        if(isEmpty()){
            add(element);
        } else if(index < 0 || index > size()){
            throw new NullPointerException();
        }  else{
            Node<T> current = first;
            for(int i = 0; i < index; i++){
                current = current.next;
            }
            current.next = new Node<T>(element, current.next);
        }
    }

    private int getIndex(T target){
        Node<T>current = first;
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
    public int size(){
        return sizeHelper(first);
    }

    private int sizeHelper(Node<T> current){
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
    public T removeByElement(T target){
        int index = getIndex(target);
        return removeByIndex(index);
    }
    
    @Override
    public T removeByIndex(int index){
        if(isEmpty()||index<0||index>size()){
            throw new NullPointerException();
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
    public String toString(){
        int position = 0;
        String result="***LINKEDLIST TRAVERSAL***\n";
        return toStringHelper(first,position,result);
    }

    private String toStringHelper(Node<T>current, int position, String result){
        if(current == null){
            return result;
        }
        result+="Position "+position+", Element: "+current.element+"\n";
        return toStringHelper(current.next,++position,result);
    }

    public static void main(String[]args){

        LinkedList<Integer> myLL = new LinkedList<Integer>();
        
        myLL.add(20);
        myLL.add(40);
        myLL.add(60);
        myLL.add(200,0);
        myLL.add(400,2);
        myLL.add(600,4);
        myLL.add(80,myLL.size());
        myLL.addBefore(2000,200);
        myLL.addBefore(4000,400);
        myLL.addBefore(6000,600);
        myLL.addBefore(800,80);
        myLL.addAfter(2,20);
        myLL.addAfter(4,40);
        myLL.addAfter(6,60);
        myLL.addAfter(8000,6);
        myLL.addAfter(8,80);
        myLL.removeByElement(2000);
        myLL.removeByElement(4000);
        myLL.removeByElement(6000);
        myLL.removeByElement(8000);
        myLL.removeByIndex(0);
        myLL.removeByIndex(myLL.size()-1);

        System.out.println(myLL.toString());

    }
}

interface LinkedListInterface<T>{
    void add(T element);
    void add(T element, int index);
    void addBefore(T element, T target);
    void addAfter(T element, T target);
    int size();
    boolean isEmpty();
    T removeByElement(T target);
    T removeByIndex(int index);
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