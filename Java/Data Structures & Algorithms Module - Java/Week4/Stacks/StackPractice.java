import java.util.Arrays;

public class StackPractice{
    public static void main(String[]args){

        StackInterfacePractice<Integer> myLinkedStack = new LinkedStackPractice<Integer>();
        StackInterfacePractice<Integer> myArrayStack = new ArrayStackPractice<Integer>(2);

        myLinkedStack.push(2);
        myLinkedStack.push(4);
        myLinkedStack.push(6);
        System.out.println(myLinkedStack.toString());
        myLinkedStack.pop();
        System.out.println("Peek: "+myLinkedStack.peek());
        System.out.println("Size: "+myLinkedStack.size());
        System.out.println("Empty: "+myLinkedStack.isEmpty());

        myArrayStack.push(2);
        myArrayStack.push(4);
        myArrayStack.push(6);
        System.out.println(myArrayStack.toString());
        System.out.println(myArrayStack.toString());
        myArrayStack.pop();
        System.out.println("Peek: "+myArrayStack.peek());
        System.out.println("Size: "+myArrayStack.size());
        System.out.println("Empty: "+myArrayStack.isEmpty());      
        System.out.println(myArrayStack.toString()); 
    }
}

interface StackInterfacePractice<T>{
    void push(T element);
    T pop();
    T peek();
    boolean isEmpty();
    int size();
}

class NodePractice<T>{
    T element;
    NodePractice<T> next;

    NodePractice(T element, NodePractice<T> next){
        this.element = element;
        this.next = next;
    }
}

class LinkedStackPractice<T> implements StackInterfacePractice<T>{
    
    NodePractice<T> first;

    @Override
    public void push(T element){
        if(isEmpty()){
            this.first = new NodePractice<T>(element, null);
        } else{
            this.first = new NodePractice<T>(element, first);
        }
    }
    
    @Override
    public T pop(){
        if(isEmpty()){
            throw new IndexOutOfBoundsException();
        } else{
            T element = first.element;
            first = first.next;
            return element;
        }
    }
    
    @Override
    public T peek(){
        if(isEmpty()){
            throw new IndexOutOfBoundsException();
        } else{
            return first.element;
        }
    }
    
    @Override
    public boolean isEmpty(){
        return first==null;
    }
    
    @Override
    public int size(){
        return sizeHelper(first);
    }
    private int sizeHelper(NodePractice<T> current){
        if(current == null){
            return 0;
        }

        return 1 + sizeHelper(current.next);
    }

    @Override
    public String toString(){
        String result = "***LINKED STACK TRAVERSAL***\n";
        int position = 0;
        NodePractice<T> current = first;
        return toStringHelper(result,position,current);
    }

    private String toStringHelper(String result, int position, NodePractice<T> current){
        if(current==null){
            return result;
        }       
        result+="Position "+position+", Element: "+current.element+"\n";
        return toStringHelper(result,++position,current.next);
    }

}

class ArrayStackPractice<T> implements StackInterfacePractice<T>{

    private T[] userInput;
    private int size;
    private int top;

    ArrayStackPractice(int size){
        this.size = size;
        this.top = -1;
        this.userInput = (T[])new Object[this.size];
    }

    @Override
    public void push(T element){
        if(this.top == this.size-1){
            reallocate();
        }
        top++;
        this.userInput[top] = element;
    }

    private void reallocate(){
        this.size*=2;
        this.userInput = Arrays.copyOf(this.userInput,this.size);
    }
    
    @Override
    public T pop(){
        if(isEmpty()){
            throw new IndexOutOfBoundsException();
        } else{
            T element = this.userInput[this.top];
            this.userInput[this.top] = null;
            top--;
            return element;
        }
    }
    
    @Override
    public T peek(){
        if(isEmpty()){
            throw new IndexOutOfBoundsException();
        } else{
            return this.userInput[this.top];
        }
    }
    
    @Override
    public boolean isEmpty(){
        return this.top == -1;
    }
    
    @Override
    public int size(){
        int size = 0;
        for(T e: this.userInput){
            if(e != null){
                size++;
            }
        }
        return size;
    }

    @Override
    public String toString(){
        int position = 0, index = this.top;
        T[] current = this.userInput;
        String result = "***ARRAY STACK TRAVERSAL***\n";
        return toStringHelper(result,position,index,current);
    }
    public String toStringHelper(String result, int position, int index, T[] current){
        if(index == -1){
            return result;
        }
        result+="Position "+position+", Element: "+current[index]+"\n";
        return toStringHelper(result,++position, --index, current);
    }


}