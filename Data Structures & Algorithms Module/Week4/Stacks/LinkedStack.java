/*
LinkedStack.java
Billy Cussen
16/09/2020
*/

public class LinkedStack<T> implements StackInterface<T>{

    Node<T> first;

    @Override
    public void push(T element){
        if(isEmpty()){
            first = new Node<T>(element);
        } else{
            first = new Node<T>(element,first);
        }
    }

    @Override
    public T pop(){
        if(!isEmpty()){
            T element = first.element;
            first = first.next;
            return element;
        } else{
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public T peek(){
        if(!isEmpty()){
            return first.element;
        } else{
            throw new IndexOutOfBoundsException();
        }
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
    public boolean isEmpty(){
        return first == null;
    }

    @Override
    public String toString(){
        String result = new String();
        int position = 0;
        Node<T> current = first;
        return toStringHelper(result,position,current);
    }

    private String toStringHelper(String result, int position, Node<T> current){
        if(current==null){
            return result;
        }
        result+="Position "+position+", Element: "+current.element+"\n";
        return toStringHelper(result,++position,current.next);
    }

}