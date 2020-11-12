/*
ArrayStack.java
Billy Cussen
12/11/2020
*/
import java.util.Arrays;
public class ArrayStack<T> implements StackInterface<T>{

    private T[] stack;
    private int size;
    private int top;

    public ArrayStack(int size){
        this.size = size;
        this.top = -1;
        this.stack = (T[])new Object[this.size];
    }

    @Override
    public void push(T element){
        if(this.top == this.size-1){
            reallocate();
        } 
        this.top++;
        this.stack[this.top]=element;
    }

    private void reallocate(){
        this.size*=2;
        this.stack = Arrays.copyOf(this.stack,this.size);
    }

    @Override
    public T pop(){
        if(isEmpty()){
            throw new NullPointerException("Can't Pop, the Stack is already Empty!");
        } else{
            T element = this.stack[this.top];
            this.top--;
            return element;
        }
    }

    @Override
    public T peek(){
        if(isEmpty()){
            throw new NullPointerException("Can't Peek, the Stack is Empty!");
        } else{
            return this.stack[top];
        }
    }

    @Override
    public int size(){
        return this.top+1;
    }

    @Override
    public boolean isEmpty(){
        return this.top == -1;
    }

    public String toString(){
        if(isEmpty()){
            return "Can't Traverse Array Stack, its empty!";
        }
        int index = size()-1;
        int position = 0;
        String result = "***ARRAY STACK TRAVERSAL***\n";
        return toStringHelper(this.stack,result,index, position);
    }

    private String toStringHelper(T[] current, String result, int index, int position){
        if(index==-1){
            result+="***END***\n";
            return result;
        }
        result+="Position: "+position+", Element: "+current[index]+"\n";
        return toStringHelper(current,result,--index,++position);
    }

}