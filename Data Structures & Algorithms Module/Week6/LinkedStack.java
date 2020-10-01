/*
LinkedStack.java
Billy Cussen
01/10/2020
*/

public class LinkedStack<T> implements StackInterface<T>{

    Node<T> first;

    @Override
    public void push(T e){
        if(isEmpty()){
            this.first = new Node<T>(e, null);
        } else{
            this.first = new Node<T>(e, this.first);
        }
    }
    
    @Override
    public T pop(){
        if(isEmpty()){
            throw new NullPointerException();
        } else{
            T element = this.first.element;
            first = this.first.next;
            return element;
        }
    }

    @Override
    public T peek(){
        return this.first.element;
    }

    @Override
    public int size(){
        return sizeHelper(this.first);
    }

    @Override
    public String toString(){
        String result = "***LINKED STACK TRAVERSAL***\n";
        int position = 0;
        Node<T> current = this.first;
        return toStringHelper(result,position,current);
    }

    private int sizeHelper(Node<T> current){
        if(current == null){
            return 0;
        }
        return 1 + sizeHelper(current.next);
    }

    private String toStringHelper(String result, int position, Node<T> current){
        if(current == null){
            return result;
        }
        result+="Position "+position+", Element: "+current.element+"\n";
        return toStringHelper(result,++position,current.next);
    }

    private boolean isEmpty(){
        return this.first == null;
    }

}