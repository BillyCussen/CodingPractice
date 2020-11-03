/*
ArrayStack.java
Billy Cussen
16/09/2020
*/
import java.util.Arrays;

public class ArrayStack<T> implements StackInterface<T>{

    private int size;
    private int top;
    private T[] items;

    public ArrayStack(int size){
        this.size = size;
        this.top = -1;
        this.items = (T[])new Object[this.size];
    }

    @Override
    public void push(T element){
        if(this.top == this.size -1){
            reallocate();
        }
        this.top++;
        this.items[this.top] = element;
    }

    private void reallocate(){
        this.size*=2;
        this.items = Arrays.copyOf(this.items,this.size);
    }

    @Override
    public T pop(){
        if(isEmpty()){
            throw new IndexOutOfBoundsException();
        } else{
            T element = this.items[this.top];
            top--;
            return element;
        }
    }

    @Override
    public T peek(){
        if(isEmpty()){
            throw new IndexOutOfBoundsException();
        } else{
            return this.items[this.top];
        }
    }

    @Override
    public int size(){
        return sizeHelper(this.items,top);
    }

    private int sizeHelper(T[] items, int top){
        if(items[top]==null){
            return 0;
        }
        return 1+sizeHelper(items, ++top);
    }

    @Override
    public boolean isEmpty(){
        return top == -1;
    }

    @Override
    public String toString(){
        int counter=0, index=this.top;
        String result = new String();
        while(index>=0){
            result+="Position "+counter+", Element: "+items[index]+"\n";
            index--;
            counter++;
        }
        return result;
    }

}