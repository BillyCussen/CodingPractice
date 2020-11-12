/*
LinkedStack.java
Billy Cussen
12/11/2020
*/
public class LinkedStack<T> implements StackInterface<T>{

    Node<T> first;

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
            throw new NullPointerException("The Stack is empty, can't pop!");
        } else{
            T element = first.element;
            first = first.next;
            return element;
        }
    }
    
    @Override
    public T peek(){
        if(isEmpty()){
            throw new NullPointerException("You can't Peek, the Stack is empty!");
        } else{
            return first.element;
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
        if(isEmpty()){
            return "The Stack is Empty, can't do a Traversal!";
        }
        String result = "***STACK TRAVERSAL***\n";
        int position = 0;
        return toStringHelper(first,result,position);
    }

    private String toStringHelper(Node<T> current, String result, int position){
        if(current == null){
            result+="***END***\n";
            return result;
        }
        result+="Position "+position+", Element: "+current.element+"\n";
        return toStringHelper(current.next,result,++position);
    }
}