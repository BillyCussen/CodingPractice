/*
Stack.java
Billy Cussen
07/01/2021
*/
public class Stack<T>{

    Node<T> first;

    public Stack(){
        this.first = null;
    }

    public boolean isEmpty(){
        return this.first == null;
    }

    public void push(T element){
        if(isEmpty()){
            this.first = new Node<T>(element,null);
        } else{
            this.first = new Node<T>(element, this.first);
        }
    }

    public T pop(){
        if(isEmpty()){
            throw new NullPointerException("Can't pop, Stack is Empty!");
        } else{
            T element = this.first.element;
            this.first = this.first.next;
            return element;
        }
    }

    public T peek(){
        if(isEmpty()){
            throw new NullPointerException("Can't peek, Stack is Empty!");
        } else{
            return this.first.element;
        }
    }

    @Override
    public String toString(){
        if(isEmpty()){
            throw new NullPointerException("Stack is Empty!");
        } 
        String result = "***STACK TRAVERSAL***\n";
        int position = 1;
        return toStringHelper(this.first, result, position);
    }

    private String toStringHelper(Node<T> current, String result, int position){
        if(current==null){
            result+="***END***\n";
            return result;
        }
        result+="Position "+position+", Element: "+current.element+"\n";
        return toStringHelper(current.next, result, ++position);
    }

    public int size(){
        if(isEmpty()){
            return 0;
        }
        return sizeHelper(this.first);
    }

    private int sizeHelper(Node<T> current){
        if(current==null){
            return 0;
        }
        return 1 + sizeHelper(current.next);
    }
}