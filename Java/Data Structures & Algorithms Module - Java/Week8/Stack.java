/*
Stack.java
Billy Cussen 
28/10/2020
*/
import java.util.*; 

public class Stack<T> implements StackInterface<T>{

    Node<T> first;

    public static void main(String [] args){

        StackInterface<Integer> myStack = new Stack<Integer>();
        System.out.println("Is Empty: "+myStack.isEmpty());
        
        try{
            System.out.println("Size: "+myStack.size());
        }catch(NullPointerException e){
            System.out.println(e.getMessage());
        }

        try{
            System.out.println("Peek: "+myStack.peek());
        }catch(NullPointerException e){
            System.out.println(e.getMessage());
        }

        try{
            System.out.println("Pop: "+myStack.pop());
        }catch(NullPointerException e){
            System.out.println(e.getMessage());
        }

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        myStack.push(6);
        myStack.push(7);

        System.out.println("Is Empty: "+myStack.isEmpty());
        System.out.println("Size: "+myStack.size());
        System.out.println("Peek: "+myStack.peek());
        System.out.println("Pop: "+myStack.pop());
        System.out.println("Size: "+myStack.size());

        System.out.println(myStack.toString());
        
        int size = myStack.size();
        for(int i = 0; i < size;i++){
            System.out.println("Pop: "+myStack.pop());
        }
        System.out.println("Is Empty: "+myStack.isEmpty());
        
        try{
            System.out.println("Size: "+myStack.size());
        }catch(NullPointerException e){
            System.out.println(e.getMessage());
        }

        try{
            System.out.println("Peek: "+myStack.peek());
        }catch(NullPointerException e){
            System.out.println(e.getMessage());
        }

        try{
            System.out.println("Pop: "+myStack.pop());
        }catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void push(T element){
        if(isEmpty()){
            first = new Node<T>(element, null);
        } else{
            first = new Node<T>(element, first);
        }
    }
    
    @Override
    public T pop(){
        if(isEmpty()){
            throw new NullPointerException("EXCEPTION: The Stack is empty, can't pop element!");
        } else{
            T element = first.element;
            first = first.next;
            return element;
        }
    }
    
    @Override
    public T peek(){
        if(isEmpty()){
            throw new NullPointerException("EXCEPTION: The Stack is Empty, can't peek element!");
        }
        return first.element;
    }
    
    @Override
    public int size(){
        if(isEmpty()){
            throw new NullPointerException("EXCEPTION: The Stack is Empty, can't get Size!");
        }
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
    public String toString(){
        if(isEmpty()){
            throw new NullPointerException("EXCEPTION: The Stack is empty, cannot print elements!");
        }
        String result = "\n***STACK TRAVERSAL***\n";
        int position = 0;
        return toStringHelper(result, position, first);
    }

    private String toStringHelper(String result, int position, Node<T> current){
        if(current==null){
            result+="***END***\n";
            return result;
        }
        result+="Position "+position+", Element: "+current.element+"\n";
        return toStringHelper(result,++position,current.next);
    }
}

interface StackInterface<T>{
    void push(T element);
    T pop();
    T peek();
    int size();
    boolean isEmpty();
}

class Node<T>{

    T element;
    Node<T> next;

    Node(T element, Node<T> next){
        this.element = element;
        this.next = next;
    }

}