/*
ArrayStack.java
Billy Cussen
07/01/2021
*/
import java.util.Arrays;

public class ArrayStack<T> {
    
    int top;
    int size;
    T[] stack;

    public ArrayStack(int size){
        this.size = size;
        this.top = -1;
        this.stack = (T[]) new Object[this.size];
    }

    public int size(){
        return sizeHelper(this.stack,top);
    }

    private int sizeHelper(T[] items, int top){
        if(items[top]==null){
            return 0;
        }
        return 1+sizeHelper(items, ++top);
    }

    public boolean isEmpty(){
        return top == -1;
    }

    @Override
    public String toString(){
        int counter=0, index=this.top;
        String result = "***ARRAYSTACK TRAVERSAL***\n";
        while(index>=0){
            result+="Position "+counter+", Element: "+this.stack[index]+"\n";
            index--;
            counter++;
        }
        result+="***END***\n";
        return result;
    }

    public void push(T element){
        if(this.top == this.size-1){
            reallocate();
        }
        this.top+=1;
        this.stack[this.top] = element;
    }

    private void reallocate(){
        this.size*=2;
        this.stack = Arrays.copyOf(this.stack, this.size);
    }

    public T pop(){
        if(isEmpty()){
            throw new NullPointerException("Can't pop, Stack is Empty!");
        } else{
            T element = this.stack[this.top];
            this.top--;
            return element;
        }
    }

    public T peek(){
        if(isEmpty()){
            throw new NullPointerException("Can't peek, Stack is Empty!");
        } else{
            return this.stack[this.top];
        }
    }

}
