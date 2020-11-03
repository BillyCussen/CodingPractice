/*
ArrayStack.java
Billy Cussen
01/10/2020
*/
import java.util.Arrays;

public class ArrayStack<T> implements StackInterface<T>{

    T [] stack;
    int size;
    int top;

    public ArrayStack(int size){
        this.top = -1;
        this.size = size;
        this.stack = (T[])new Object[this.size];
    }

    @Override
    public void push(T e){
        if(top == this.size - 1){
            reallocate();
        }
        this.top++;
        this.stack[this.top] = e;
    }
    
    @Override
    public T pop(){
        if(isEmpty()){
            throw new NullPointerException();
        } else{
            T element = this.stack[this.top];
            this.top--;
            return element;
        }
    }

    @Override
    public T peek(){
        if(isEmpty()){
            throw new NullPointerException();
        } else{
            return this.stack[this.top];
        }
    }

    @Override
    public int size(){
        return sizeHelper(this.stack, this.top);
    }


    @Override
    public String toString(){
        int position = 0, index = this.top;
        String result = "***ARRAY STACK TRAVERSAL***\n";
        while(index >= 0){
            result+="Position "+position+", Element: "+this.stack[index]+"\n";
            position++;
            index--;
        }
        return result;
    }

    private void reallocate(){
        this.size*=2;
        this.stack = Arrays.copyOf(this.stack,this.size);
    }

    private boolean isEmpty(){
        return this.top == -1;
    }

    private int sizeHelper(T[] items, int top){
        if(top == - 1){
            return 0;
        }
        return 1 + sizeHelper(items, --top);
    }

}